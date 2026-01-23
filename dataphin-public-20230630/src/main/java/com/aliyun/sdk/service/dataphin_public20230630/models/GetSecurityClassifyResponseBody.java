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
 * {@link GetSecurityClassifyResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityClassifyResponseBody</p>
 */
public class GetSecurityClassifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityClassifyInfo")
    private SecurityClassifyInfo securityClassifyInfo;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSecurityClassifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.securityClassifyInfo = builder.securityClassifyInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityClassifyResponseBody create() {
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
     * @return securityClassifyInfo
     */
    public SecurityClassifyInfo getSecurityClassifyInfo() {
        return this.securityClassifyInfo;
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
        private SecurityClassifyInfo securityClassifyInfo; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSecurityClassifyResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.securityClassifyInfo = model.securityClassifyInfo;
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
         * SecurityClassifyInfo.
         */
        public Builder securityClassifyInfo(SecurityClassifyInfo securityClassifyInfo) {
            this.securityClassifyInfo = securityClassifyInfo;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSecurityClassifyResponseBody build() {
            return new GetSecurityClassifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityClassifyResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityClassifyResponseBody</p>
     */
    public static class SecurityClassifyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Abbreviation")
        private String abbreviation;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LevelAbbreviation")
        private String levelAbbreviation;

        @com.aliyun.core.annotation.NameInMap("LevelIndex")
        private Long levelIndex;

        @com.aliyun.core.annotation.NameInMap("LevelName")
        private String levelName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private SecurityClassifyInfo(Builder builder) {
            this.abbreviation = builder.abbreviation;
            this.id = builder.id;
            this.levelAbbreviation = builder.levelAbbreviation;
            this.levelIndex = builder.levelIndex;
            this.levelName = builder.levelName;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityClassifyInfo create() {
            return builder().build();
        }

        /**
         * @return abbreviation
         */
        public String getAbbreviation() {
            return this.abbreviation;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return levelAbbreviation
         */
        public String getLevelAbbreviation() {
            return this.levelAbbreviation;
        }

        /**
         * @return levelIndex
         */
        public Long getLevelIndex() {
            return this.levelIndex;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String abbreviation; 
            private Long id; 
            private String levelAbbreviation; 
            private Long levelIndex; 
            private String levelName; 
            private String name; 
            private String path; 

            private Builder() {
            } 

            private Builder(SecurityClassifyInfo model) {
                this.abbreviation = model.abbreviation;
                this.id = model.id;
                this.levelAbbreviation = model.levelAbbreviation;
                this.levelIndex = model.levelIndex;
                this.levelName = model.levelName;
                this.name = model.name;
                this.path = model.path;
            } 

            /**
             * Abbreviation.
             */
            public Builder abbreviation(String abbreviation) {
                this.abbreviation = abbreviation;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LevelAbbreviation.
             */
            public Builder levelAbbreviation(String levelAbbreviation) {
                this.levelAbbreviation = levelAbbreviation;
                return this;
            }

            /**
             * LevelIndex.
             */
            public Builder levelIndex(Long levelIndex) {
                this.levelIndex = levelIndex;
                return this;
            }

            /**
             * LevelName.
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
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
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public SecurityClassifyInfo build() {
                return new SecurityClassifyInfo(this);
            } 

        } 

    }
}
