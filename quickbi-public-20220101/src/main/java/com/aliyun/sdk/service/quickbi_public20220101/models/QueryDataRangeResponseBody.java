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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryDataRangeResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-****-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Data range object.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(ApiCopilotLlmCubeModels model) {
                this.alias = model.alias;
                this.createUser = model.createUser;
                this.llmCubeId = model.llmCubeId;
            } 

            /**
             * <p>Alias of the LlmCube resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>Nickname of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>zhuge</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>LlmCube resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sdasdafas23342342342</p>
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

            private Builder() {
            } 

            private Builder(ApiCopilotThemeModelsApiCopilotLlmCubeModels model) {
                this.alias = model.alias;
                this.createUser = model.createUser;
                this.llmCubeId = model.llmCubeId;
            } 

            /**
             * <p>Alias of the LLM cube resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>Nickname of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>zhuge</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>LlmCube resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1231242231asdasda</p>
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

            private Builder() {
            } 

            private Builder(ApiCopilotThemeModels model) {
                this.apiCopilotLlmCubeModels = model.apiCopilotLlmCubeModels;
                this.createUser = model.createUser;
                this.themeId = model.themeId;
                this.themeName = model.themeName;
            } 

            /**
             * <p>Array of LlmCube resources.</p>
             */
            public Builder apiCopilotLlmCubeModels(java.util.List<ApiCopilotThemeModelsApiCopilotLlmCubeModels> apiCopilotLlmCubeModels) {
                this.apiCopilotLlmCubeModels = apiCopilotLlmCubeModels;
                return this;
            }

            /**
             * <p>Nickname of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>zhuge</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>Analysis theme ID.</p>
             * 
             * <strong>example:</strong>
             * <p>36631232342312312</p>
             */
            public Builder themeId(String themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * <p>Nickname of the analysis theme.</p>
             * 
             * <strong>example:</strong>
             * <p>test theme</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.apiCopilotLlmCubeModels = model.apiCopilotLlmCubeModels;
                this.apiCopilotThemeModels = model.apiCopilotThemeModels;
            } 

            /**
             * <p>Array of LlmCube resources.</p>
             */
            public Builder apiCopilotLlmCubeModels(java.util.List<ApiCopilotLlmCubeModels> apiCopilotLlmCubeModels) {
                this.apiCopilotLlmCubeModels = apiCopilotLlmCubeModels;
                return this;
            }

            /**
             * <p>Array of analysis themes.</p>
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
