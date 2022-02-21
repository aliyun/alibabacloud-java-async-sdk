// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrganizationSettingTabsResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrganizationSettingTabsResponseBody</p>
 */
public class GetOrganizationSettingTabsResponseBody extends TeaModel {
    @NameInMap("Success")
    private Boolean success;

    @NameInMap("code")
    private Long code;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("traceId")
    private String traceId;

    private GetOrganizationSettingTabsResponseBody(Builder builder) {
        this.success = builder.success;
        this.code = builder.code;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationSettingTabsResponseBody create() {
        return builder().build();
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Boolean success; 
        private Long code; 
        private String errorMsg; 
        private String requestId; 
        private java.util.List < Result> result; 
        private String traceId; 

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetOrganizationSettingTabsResponseBody build() {
            return new GetOrganizationSettingTabsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("icon")
        private String icon;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("name")
        private String name;

        @NameInMap("nameEn")
        private String nameEn;

        @NameInMap("url")
        private String url;

        private Result(Builder builder) {
            this.icon = builder.icon;
            this.identifier = builder.identifier;
            this.name = builder.name;
            this.nameEn = builder.nameEn;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String icon; 
            private String identifier; 
            private String name; 
            private String nameEn; 
            private String url; 

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nameEn.
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
