// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link CreateFixedNoAReportResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFixedNoAReportResponseBody</p>
 */
public class CreateFixedNoAReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateFixedNoAReportResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFixedNoAReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateFixedNoAReportResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Details of denied access.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Request status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The struct of the reporting result for number A.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error message for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>固话号码***已存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1D73E648-0978-18A5-B089-3BB2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded. Valid values:</p>
         * <ul>
         * <li><p>true: Succeeded.</p>
         * </li>
         * <li><p>false: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateFixedNoAReportResponseBody build() {
            return new CreateFixedNoAReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateFixedNoAReportResponseBody} extends {@link TeaModel}
     *
     * <p>CreateFixedNoAReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateResult")
        private Boolean createResult;

        @com.aliyun.core.annotation.NameInMap("FailType")
        private Long failType;

        private Data(Builder builder) {
            this.createResult = builder.createResult;
            this.failType = builder.failType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createResult
         */
        public Boolean getCreateResult() {
            return this.createResult;
        }

        /**
         * @return failType
         */
        public Long getFailType() {
            return this.failType;
        }

        public static final class Builder {
            private Boolean createResult; 
            private Long failType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createResult = model.createResult;
                this.failType = model.failType;
            } 

            /**
             * <p>Creation result.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder createResult(Boolean createResult) {
                this.createResult = createResult;
                return this;
            }

            /**
             * <p>Enumeration of creation types. The value 1 indicates success, and negative numbers indicate creation failure. Valid values:</p>
             * <ul>
             * <li><p>1: Succeeded.</p>
             * </li>
             * <li><p>-1: The phone number has already been submitted for reporting; no need to submit again.</p>
             * </li>
             * <li><p>-2: The phone number has already been successfully reported; no need to report again.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failType(Long failType) {
                this.failType = failType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
