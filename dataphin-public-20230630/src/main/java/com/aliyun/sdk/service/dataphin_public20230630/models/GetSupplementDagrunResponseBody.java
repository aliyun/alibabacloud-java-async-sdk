// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetSupplementDagrunResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupplementDagrunResponseBody</p>
 */
public class GetSupplementDagrunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DagrunList")
    private java.util.List<DagrunList> dagrunList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSupplementDagrunResponseBody(Builder builder) {
        this.code = builder.code;
        this.dagrunList = builder.dagrunList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupplementDagrunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dagrunList
     */
    public java.util.List<DagrunList> getDagrunList() {
        return this.dagrunList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<DagrunList> dagrunList; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSupplementDagrunResponseBody model) {
            this.code = model.code;
            this.dagrunList = model.dagrunList;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DagrunList.
         */
        public Builder dagrunList(java.util.List<DagrunList> dagrunList) {
            this.dagrunList = dagrunList;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSupplementDagrunResponseBody build() {
            return new GetSupplementDagrunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSupplementDagrunResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupplementDagrunResponseBody</p>
     */
    public static class DagrunList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("EndExecuteTime")
        private Long endExecuteTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("StartExecuteTime")
        private Long startExecuteTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupplementId")
        private String supplementId;

        private DagrunList(Builder builder) {
            this.bizDate = builder.bizDate;
            this.duration = builder.duration;
            this.endExecuteTime = builder.endExecuteTime;
            this.id = builder.id;
            this.startExecuteTime = builder.startExecuteTime;
            this.status = builder.status;
            this.supplementId = builder.supplementId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagrunList create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return endExecuteTime
         */
        public Long getEndExecuteTime() {
            return this.endExecuteTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return startExecuteTime
         */
        public Long getStartExecuteTime() {
            return this.startExecuteTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supplementId
         */
        public String getSupplementId() {
            return this.supplementId;
        }

        public static final class Builder {
            private String bizDate; 
            private String duration; 
            private Long endExecuteTime; 
            private String id; 
            private Long startExecuteTime; 
            private String status; 
            private String supplementId; 

            private Builder() {
            } 

            private Builder(DagrunList model) {
                this.bizDate = model.bizDate;
                this.duration = model.duration;
                this.endExecuteTime = model.endExecuteTime;
                this.id = model.id;
                this.startExecuteTime = model.startExecuteTime;
                this.status = model.status;
                this.supplementId = model.supplementId;
            } 

            /**
             * BizDate.
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndExecuteTime.
             */
            public Builder endExecuteTime(Long endExecuteTime) {
                this.endExecuteTime = endExecuteTime;
                return this;
            }

            /**
             * <p>Dagrun ID</p>
             * 
             * <strong>example:</strong>
             * <p>dr_2242792_14542</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * StartExecuteTime.
             */
            public Builder startExecuteTime(Long startExecuteTime) {
                this.startExecuteTime = startExecuteTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupplementId.
             */
            public Builder supplementId(String supplementId) {
                this.supplementId = supplementId;
                return this;
            }

            public DagrunList build() {
                return new DagrunList(this);
            } 

        } 

    }
}
