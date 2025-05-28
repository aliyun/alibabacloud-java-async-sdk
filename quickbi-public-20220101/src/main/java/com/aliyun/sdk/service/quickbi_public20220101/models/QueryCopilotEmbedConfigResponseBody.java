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

        private Builder() {
        } 

        private Builder(QueryCopilotEmbedConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1FC71085-D5FD-08E0-813A-4D4BD1031BC5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of embedded configurations.</p>
         */
        public Builder result(java.util.List<Result> result) {
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

            private Builder() {
            } 

            private Builder(DataRange model) {
                this.allCube = model.allCube;
                this.allTheme = model.allTheme;
                this.llmCubes = model.llmCubes;
                this.themes = model.themes;
            } 

            /**
             * <p>Whether all question resources are selected.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder allCube(Boolean allCube) {
                this.allCube = allCube;
                return this;
            }

            /**
             * <p>Whether all analysis themes are selected.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder allTheme(Boolean allTheme) {
                this.allTheme = allTheme;
                return this;
            }

            /**
             * <p>Collection of question resource IDs.</p>
             */
            public Builder llmCubes(java.util.List<String> llmCubes) {
                this.llmCubes = llmCubes;
                return this;
            }

            /**
             * <p>Collection of analysis theme IDs.</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.agentName = model.agentName;
                this.copilotId = model.copilotId;
                this.createUser = model.createUser;
                this.createUserName = model.createUserName;
                this.dataRange = model.dataRange;
                this.modifyUser = model.modifyUser;
                this.moduleName = model.moduleName;
                this.showName = model.showName;
            } 

            /**
             * <p>Robot&quot;s nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>little Q</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>Embedding ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9c079710-ddbe-48b3-b495-7c83c8d57cc4</p>
             */
            public Builder copilotId(String copilotId) {
                this.copilotId = copilotId;
                return this;
            }

            /**
             * <p>ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>qweqw12312423521</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>Nickname of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * <p>Data range (analysis themes and question resources).</p>
             */
            public Builder dataRange(DataRange dataRange) {
                this.dataRange = dataRange;
                return this;
            }

            /**
             * <p>ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>asda1231231dfs</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>Module name.</p>
             * 
             * <strong>example:</strong>
             * <p>little Q</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>Name of the embedded module.</p>
             * 
             * <strong>example:</strong>
             * <p>0327</p>
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
