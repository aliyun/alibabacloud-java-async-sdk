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
 * {@link GetSecurityLevelResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityLevelResponseBody</p>
 */
public class GetSecurityLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityLevelInfo")
    private SecurityLevelInfo securityLevelInfo;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSecurityLevelResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.securityLevelInfo = builder.securityLevelInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityLevelResponseBody create() {
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
     * @return securityLevelInfo
     */
    public SecurityLevelInfo getSecurityLevelInfo() {
        return this.securityLevelInfo;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private SecurityLevelInfo securityLevelInfo; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSecurityLevelResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.securityLevelInfo = model.securityLevelInfo;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityLevelInfo.
         */
        public Builder securityLevelInfo(SecurityLevelInfo securityLevelInfo) {
            this.securityLevelInfo = securityLevelInfo;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSecurityLevelResponseBody build() {
            return new GetSecurityLevelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityLevelResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityLevelResponseBody</p>
     */
    public static class SecurityLevelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Abbreviation")
        private String abbreviation;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelatedClassifyIdList")
        private java.util.List<Long> relatedClassifyIdList;

        private SecurityLevelInfo(Builder builder) {
            this.abbreviation = builder.abbreviation;
            this.description = builder.description;
            this.index = builder.index;
            this.name = builder.name;
            this.relatedClassifyIdList = builder.relatedClassifyIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityLevelInfo create() {
            return builder().build();
        }

        /**
         * @return abbreviation
         */
        public String getAbbreviation() {
            return this.abbreviation;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relatedClassifyIdList
         */
        public java.util.List<Long> getRelatedClassifyIdList() {
            return this.relatedClassifyIdList;
        }

        public static final class Builder {
            private String abbreviation; 
            private String description; 
            private Long index; 
            private String name; 
            private java.util.List<Long> relatedClassifyIdList; 

            private Builder() {
            } 

            private Builder(SecurityLevelInfo model) {
                this.abbreviation = model.abbreviation;
                this.description = model.description;
                this.index = model.index;
                this.name = model.name;
                this.relatedClassifyIdList = model.relatedClassifyIdList;
            } 

            /**
             * Abbreviation.
             */
            public Builder abbreviation(String abbreviation) {
                this.abbreviation = abbreviation;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RelatedClassifyIdList.
             */
            public Builder relatedClassifyIdList(java.util.List<Long> relatedClassifyIdList) {
                this.relatedClassifyIdList = relatedClassifyIdList;
                return this;
            }

            public SecurityLevelInfo build() {
                return new SecurityLevelInfo(this);
            } 

        } 

    }
}
