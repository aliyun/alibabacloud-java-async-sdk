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
 * {@link QueryCopilotEmbedConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCopilotEmbedConfigResponseBody</p>
 */
public class QueryCopilotEmbedConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCopilotEmbedConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCopilotEmbedConfigResponseBody create() {
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
    public java.util.List<Result> getResult() {
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
        private java.util.List<Result> result; 
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
        public Builder result(java.util.List<Result> result) {
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

        public QueryCopilotEmbedConfigResponseBody build() {
            return new QueryCopilotEmbedConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCopilotEmbedConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCopilotEmbedConfigResponseBody</p>
     */
    public static class DataRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCube")
        private Boolean allCube;

        @com.aliyun.core.annotation.NameInMap("AllTheme")
        private Boolean allTheme;

        @com.aliyun.core.annotation.NameInMap("LlmCubes")
        private java.util.List<String> llmCubes;

        @com.aliyun.core.annotation.NameInMap("Themes")
        private java.util.List<String> themes;

        private DataRange(Builder builder) {
            this.allCube = builder.allCube;
            this.allTheme = builder.allTheme;
            this.llmCubes = builder.llmCubes;
            this.themes = builder.themes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataRange create() {
            return builder().build();
        }

        /**
         * @return allCube
         */
        public Boolean getAllCube() {
            return this.allCube;
        }

        /**
         * @return allTheme
         */
        public Boolean getAllTheme() {
            return this.allTheme;
        }

        /**
         * @return llmCubes
         */
        public java.util.List<String> getLlmCubes() {
            return this.llmCubes;
        }

        /**
         * @return themes
         */
        public java.util.List<String> getThemes() {
            return this.themes;
        }

        public static final class Builder {
            private Boolean allCube; 
            private Boolean allTheme; 
            private java.util.List<String> llmCubes; 
            private java.util.List<String> themes; 

            /**
             * AllCube.
             */
            public Builder allCube(Boolean allCube) {
                this.allCube = allCube;
                return this;
            }

            /**
             * AllTheme.
             */
            public Builder allTheme(Boolean allTheme) {
                this.allTheme = allTheme;
                return this;
            }

            /**
             * LlmCubes.
             */
            public Builder llmCubes(java.util.List<String> llmCubes) {
                this.llmCubes = llmCubes;
                return this;
            }

            /**
             * Themes.
             */
            public Builder themes(java.util.List<String> themes) {
                this.themes = themes;
                return this;
            }

            public DataRange build() {
                return new DataRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCopilotEmbedConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCopilotEmbedConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("CopilotId")
        private String copilotId;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("DataRange")
        private DataRange dataRange;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        private Result(Builder builder) {
            this.agentName = builder.agentName;
            this.copilotId = builder.copilotId;
            this.createUser = builder.createUser;
            this.createUserName = builder.createUserName;
            this.dataRange = builder.dataRange;
            this.modifyUser = builder.modifyUser;
            this.moduleName = builder.moduleName;
            this.showName = builder.showName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return copilotId
         */
        public String getCopilotId() {
            return this.copilotId;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return dataRange
         */
        public DataRange getDataRange() {
            return this.dataRange;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        public static final class Builder {
            private String agentName; 
            private String copilotId; 
            private String createUser; 
            private String createUserName; 
            private DataRange dataRange; 
            private String modifyUser; 
            private String moduleName; 
            private String showName; 

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * CopilotId.
             */
            public Builder copilotId(String copilotId) {
                this.copilotId = copilotId;
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
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * DataRange.
             */
            public Builder dataRange(DataRange dataRange) {
                this.dataRange = dataRange;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
