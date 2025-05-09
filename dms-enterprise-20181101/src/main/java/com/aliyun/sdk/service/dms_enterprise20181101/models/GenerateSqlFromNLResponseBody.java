// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GenerateSqlFromNLResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateSqlFromNLResponseBody</p>
 */
public class GenerateSqlFromNLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GenerateSqlFromNLResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSqlFromNLResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GenerateSqlFromNLResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GenerateSqlFromNLResponseBody build() {
            return new GenerateSqlFromNLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateSqlFromNLResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateSqlFromNLResponseBody</p>
     */
    public static class KnowledgeReferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private KnowledgeReferences(Builder builder) {
            this.content = builder.content;
            this.level = builder.level;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeReferences create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String content; 
            private String level; 
            private String name; 

            private Builder() {
            } 

            private Builder(KnowledgeReferences model) {
                this.content = model.content;
                this.level = model.level;
                this.name = model.name;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public KnowledgeReferences build() {
                return new KnowledgeReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateSqlFromNLResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateSqlFromNLResponseBody</p>
     */
    public static class SimilarSql extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Question")
        private String question;

        @com.aliyun.core.annotation.NameInMap("Score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("Thought")
        private String thought;

        private SimilarSql(Builder builder) {
            this.question = builder.question;
            this.score = builder.score;
            this.sql = builder.sql;
            this.thought = builder.thought;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimilarSql create() {
            return builder().build();
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return thought
         */
        public String getThought() {
            return this.thought;
        }

        public static final class Builder {
            private String question; 
            private String score; 
            private String sql; 
            private String thought; 

            private Builder() {
            } 

            private Builder(SimilarSql model) {
                this.question = model.question;
                this.score = model.score;
                this.sql = model.sql;
                this.thought = model.thought;
            } 

            /**
             * Question.
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * Thought.
             */
            public Builder thought(String thought) {
                this.thought = thought;
                return this;
            }

            public SimilarSql build() {
                return new SimilarSql(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateSqlFromNLResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateSqlFromNLResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Tables(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String tableName; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.tableName = model.tableName;
            } 

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateSqlFromNLResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateSqlFromNLResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KnowledgeReferences")
        private java.util.List<KnowledgeReferences> knowledgeReferences;

        @com.aliyun.core.annotation.NameInMap("Question")
        private String question;

        @com.aliyun.core.annotation.NameInMap("SimilarSql")
        private java.util.List<SimilarSql> similarSql;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        @com.aliyun.core.annotation.NameInMap("Thought")
        private String thought;

        private Data(Builder builder) {
            this.knowledgeReferences = builder.knowledgeReferences;
            this.question = builder.question;
            this.similarSql = builder.similarSql;
            this.sql = builder.sql;
            this.tables = builder.tables;
            this.thought = builder.thought;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return knowledgeReferences
         */
        public java.util.List<KnowledgeReferences> getKnowledgeReferences() {
            return this.knowledgeReferences;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return similarSql
         */
        public java.util.List<SimilarSql> getSimilarSql() {
            return this.similarSql;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        /**
         * @return thought
         */
        public String getThought() {
            return this.thought;
        }

        public static final class Builder {
            private java.util.List<KnowledgeReferences> knowledgeReferences; 
            private String question; 
            private java.util.List<SimilarSql> similarSql; 
            private String sql; 
            private java.util.List<Tables> tables; 
            private String thought; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.knowledgeReferences = model.knowledgeReferences;
                this.question = model.question;
                this.similarSql = model.similarSql;
                this.sql = model.sql;
                this.tables = model.tables;
                this.thought = model.thought;
            } 

            /**
             * KnowledgeReferences.
             */
            public Builder knowledgeReferences(java.util.List<KnowledgeReferences> knowledgeReferences) {
                this.knowledgeReferences = knowledgeReferences;
                return this;
            }

            /**
             * Question.
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * SimilarSql.
             */
            public Builder similarSql(java.util.List<SimilarSql> similarSql) {
                this.similarSql = similarSql;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * Thought.
             */
            public Builder thought(String thought) {
                this.thought = thought;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
