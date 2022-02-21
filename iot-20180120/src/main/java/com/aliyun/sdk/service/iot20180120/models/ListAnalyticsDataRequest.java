// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnalyticsDataRequest} extends {@link RequestModel}
 *
 * <p>ListAnalyticsDataRequest</p>
 */
public class ListAnalyticsDataRequest extends Request {
    @Query
    @NameInMap("ApiPath")
    @Validation(required = true)
    private String apiPath;

    @Query
    @NameInMap("Condition")
    private java.util.List < Condition> condition;

    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    @Query
    @NameInMap("IsoId")
    private String isoId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
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
    public java.util.List < Condition> getCondition() {
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
        private java.util.List < Condition> condition; 
        private String iotInstanceId; 
        private String isoId; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAnalyticsDataRequest response) {
            super(response);
            this.apiPath = response.apiPath;
            this.condition = response.condition;
            this.iotInstanceId = response.iotInstanceId;
            this.isoId = response.isoId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
        } 

        /**
         * ApiPath.
         */
        public Builder apiPath(String apiPath) {
            this.putQueryParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(java.util.List < Condition> condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * IotInstanceId.
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

    public static class Condition extends TeaModel {
        @NameInMap("BetweenEnd")
        private String betweenEnd;

        @NameInMap("BetweenStart")
        private String betweenStart;

        @NameInMap("FieldName")
        @Validation(required = true)
        private String fieldName;

        @NameInMap("Operate")
        @Validation(required = true)
        private String operate;

        @NameInMap("Value")
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
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * Operate.
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
