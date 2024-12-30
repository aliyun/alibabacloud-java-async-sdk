// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryDataRangeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDataRangeResponseBody</p>
 */
public class QueryDataRangeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDataRangeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataRangeResponseBody create() {
        return builder().build();
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
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDataRangeResponseBody build() {
            return new QueryDataRangeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDataRangeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataRangeResponseBody</p>
     */
    public static class ApiCopilotLlmCubeModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("LlmCubeId")
        private String llmCubeId;

        private ApiCopilotLlmCubeModels(Builder builder) {
            this.alias = builder.alias;
            this.createUser = builder.createUser;
            this.llmCubeId = builder.llmCubeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiCopilotLlmCubeModels create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return llmCubeId
         */
        public String getLlmCubeId() {
            return this.llmCubeId;
        }

        public static final class Builder {
            private String alias; 
            private String createUser; 
            private String llmCubeId; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * LlmCubeId.
             */
            public Builder llmCubeId(String llmCubeId) {
                this.llmCubeId = llmCubeId;
                return this;
            }

            public ApiCopilotLlmCubeModels build() {
                return new ApiCopilotLlmCubeModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataRangeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataRangeResponseBody</p>
     */
    public static class ApiCopilotThemeModelsApiCopilotLlmCubeModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("LlmCubeId")
        private String llmCubeId;

        private ApiCopilotThemeModelsApiCopilotLlmCubeModels(Builder builder) {
            this.alias = builder.alias;
            this.createUser = builder.createUser;
            this.llmCubeId = builder.llmCubeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiCopilotThemeModelsApiCopilotLlmCubeModels create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return llmCubeId
         */
        public String getLlmCubeId() {
            return this.llmCubeId;
        }

        public static final class Builder {
            private String alias; 
            private String createUser; 
            private String llmCubeId; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * LlmCubeId.
             */
            public Builder llmCubeId(String llmCubeId) {
                this.llmCubeId = llmCubeId;
                return this;
            }

            public ApiCopilotThemeModelsApiCopilotLlmCubeModels build() {
                return new ApiCopilotThemeModelsApiCopilotLlmCubeModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataRangeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataRangeResponseBody</p>
     */
    public static class ApiCopilotThemeModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiCopilotLlmCubeModels")
        private java.util.List<ApiCopilotThemeModelsApiCopilotLlmCubeModels> apiCopilotLlmCubeModels;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("ThemeId")
        private String themeId;

        @com.aliyun.core.annotation.NameInMap("ThemeName")
        private String themeName;

        private ApiCopilotThemeModels(Builder builder) {
            this.apiCopilotLlmCubeModels = builder.apiCopilotLlmCubeModels;
            this.createUser = builder.createUser;
            this.themeId = builder.themeId;
            this.themeName = builder.themeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiCopilotThemeModels create() {
            return builder().build();
        }

        /**
         * @return apiCopilotLlmCubeModels
         */
        public java.util.List<ApiCopilotThemeModelsApiCopilotLlmCubeModels> getApiCopilotLlmCubeModels() {
            return this.apiCopilotLlmCubeModels;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return themeId
         */
        public String getThemeId() {
            return this.themeId;
        }

        /**
         * @return themeName
         */
        public String getThemeName() {
            return this.themeName;
        }

        public static final class Builder {
            private java.util.List<ApiCopilotThemeModelsApiCopilotLlmCubeModels> apiCopilotLlmCubeModels; 
            private String createUser; 
            private String themeId; 
            private String themeName; 

            /**
             * ApiCopilotLlmCubeModels.
             */
            public Builder apiCopilotLlmCubeModels(java.util.List<ApiCopilotThemeModelsApiCopilotLlmCubeModels> apiCopilotLlmCubeModels) {
                this.apiCopilotLlmCubeModels = apiCopilotLlmCubeModels;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * ThemeId.
             */
            public Builder themeId(String themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * ThemeName.
             */
            public Builder themeName(String themeName) {
                this.themeName = themeName;
                return this;
            }

            public ApiCopilotThemeModels build() {
                return new ApiCopilotThemeModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDataRangeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataRangeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiCopilotLlmCubeModels")
        private java.util.List<ApiCopilotLlmCubeModels> apiCopilotLlmCubeModels;

        @com.aliyun.core.annotation.NameInMap("ApiCopilotThemeModels")
        private java.util.List<ApiCopilotThemeModels> apiCopilotThemeModels;

        private Result(Builder builder) {
            this.apiCopilotLlmCubeModels = builder.apiCopilotLlmCubeModels;
            this.apiCopilotThemeModels = builder.apiCopilotThemeModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return apiCopilotLlmCubeModels
         */
        public java.util.List<ApiCopilotLlmCubeModels> getApiCopilotLlmCubeModels() {
            return this.apiCopilotLlmCubeModels;
        }

        /**
         * @return apiCopilotThemeModels
         */
        public java.util.List<ApiCopilotThemeModels> getApiCopilotThemeModels() {
            return this.apiCopilotThemeModels;
        }

        public static final class Builder {
            private java.util.List<ApiCopilotLlmCubeModels> apiCopilotLlmCubeModels; 
            private java.util.List<ApiCopilotThemeModels> apiCopilotThemeModels; 

            /**
             * ApiCopilotLlmCubeModels.
             */
            public Builder apiCopilotLlmCubeModels(java.util.List<ApiCopilotLlmCubeModels> apiCopilotLlmCubeModels) {
                this.apiCopilotLlmCubeModels = apiCopilotLlmCubeModels;
                return this;
            }

            /**
             * ApiCopilotThemeModels.
             */
            public Builder apiCopilotThemeModels(java.util.List<ApiCopilotThemeModels> apiCopilotThemeModels) {
                this.apiCopilotThemeModels = apiCopilotThemeModels;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
