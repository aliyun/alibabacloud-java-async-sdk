// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAnalyticsDataRequest} extends {@link RequestModel}
 *
 * <p>ListAnalyticsDataRequest</p>
 */
public class ListAnalyticsDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private java.util.List<Condition> condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsoId")
    private String isoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 20000, minimum = 1)
    private Integer pageSize;

    private ListAnalyticsDataRequest(Builder builder) {
        super(builder);
        this.apiPath = builder.apiPath;
        this.condition = builder.condition;
        this.iotInstanceId = builder.iotInstanceId;
        this.isoId = builder.isoId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnalyticsDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiPath
     */
    public String getApiPath() {
        return this.apiPath;
    }

    /**
     * @return condition
     */
    public java.util.List<Condition> getCondition() {
        return this.condition;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return isoId
     */
    public String getIsoId() {
        return this.isoId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListAnalyticsDataRequest, Builder> {
        private String apiPath; 
        private java.util.List<Condition> condition; 
        private String iotInstanceId; 
        private String isoId; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAnalyticsDataRequest request) {
            super(request);
            this.apiPath = request.apiPath;
            this.condition = request.condition;
            this.iotInstanceId = request.iotInstanceId;
            this.isoId = request.isoId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiPath(String apiPath) {
            this.putQueryParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(java.util.List<Condition> condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-npk1u******</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * IsoId.
         */
        public Builder isoId(String isoId) {
            this.putQueryParameter("IsoId", isoId);
            this.isoId = isoId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListAnalyticsDataRequest build() {
            return new ListAnalyticsDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAnalyticsDataRequest} extends {@link TeaModel}
     *
     * <p>ListAnalyticsDataRequest</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BetweenEnd")
        private String betweenEnd;

        @com.aliyun.core.annotation.NameInMap("BetweenStart")
        private String betweenStart;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Operate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operate;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Condition(Builder builder) {
            this.betweenEnd = builder.betweenEnd;
            this.betweenStart = builder.betweenStart;
            this.fieldName = builder.fieldName;
            this.operate = builder.operate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return betweenEnd
         */
        public String getBetweenEnd() {
            return this.betweenEnd;
        }

        /**
         * @return betweenStart
         */
        public String getBetweenStart() {
            return this.betweenStart;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return operate
         */
        public String getOperate() {
            return this.operate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String betweenEnd; 
            private String betweenStart; 
            private String fieldName; 
            private String operate; 
            private String value; 

            private Builder() {
            } 

            private Builder(Condition model) {
                this.betweenEnd = model.betweenEnd;
                this.betweenStart = model.betweenStart;
                this.fieldName = model.fieldName;
                this.operate = model.operate;
                this.value = model.value;
            } 

            /**
             * BetweenEnd.
             */
            public Builder betweenEnd(String betweenEnd) {
                this.betweenEnd = betweenEnd;
                return this;
            }

            /**
             * BetweenStart.
             */
            public Builder betweenStart(String betweenStart) {
                this.betweenStart = betweenStart;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testCode</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operate(String operate) {
                this.operate = operate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
}
