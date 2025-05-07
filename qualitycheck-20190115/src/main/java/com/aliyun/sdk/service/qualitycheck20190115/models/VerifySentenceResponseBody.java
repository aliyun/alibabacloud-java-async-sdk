// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link VerifySentenceResponseBody} extends {@link TeaModel}
 *
 * <p>VerifySentenceResponseBody</p>
 */
public class VerifySentenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("IncorrectWords")
    private Integer incorrectWords;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceRole")
    private Integer sourceRole;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TargetRole")
    private Integer targetRole;

    private VerifySentenceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.incorrectWords = builder.incorrectWords;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sourceRole = builder.sourceRole;
        this.success = builder.success;
        this.targetRole = builder.targetRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifySentenceResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return incorrectWords
     */
    public Integer getIncorrectWords() {
        return this.incorrectWords;
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
     * @return sourceRole
     */
    public Integer getSourceRole() {
        return this.sourceRole;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return targetRole
     */
    public Integer getTargetRole() {
        return this.targetRole;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer incorrectWords; 
        private String message; 
        private String requestId; 
        private Integer sourceRole; 
        private Boolean success; 
        private Integer targetRole; 

        private Builder() {
        } 

        private Builder(VerifySentenceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.incorrectWords = model.incorrectWords;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sourceRole = model.sourceRole;
            this.success = model.success;
            this.targetRole = model.targetRole;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * IncorrectWords.
         */
        public Builder incorrectWords(Integer incorrectWords) {
            this.incorrectWords = incorrectWords;
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
         * SourceRole.
         */
        public Builder sourceRole(Integer sourceRole) {
            this.sourceRole = sourceRole;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TargetRole.
         */
        public Builder targetRole(Integer targetRole) {
            this.targetRole = targetRole;
            return this;
        }

        public VerifySentenceResponseBody build() {
            return new VerifySentenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifySentenceResponseBody} extends {@link TeaModel}
     *
     * <p>VerifySentenceResponseBody</p>
     */
    public static class Line extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private java.util.List<String> line;

        private Line(Builder builder) {
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Line create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public java.util.List<String> getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List<String> line; 

            private Builder() {
            } 

            private Builder(Line model) {
                this.line = model.line;
            } 

            /**
             * Line.
             */
            public Builder line(java.util.List<String> line) {
                this.line = line;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifySentenceResponseBody} extends {@link TeaModel}
     *
     * <p>VerifySentenceResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private Line line;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        private Source(Builder builder) {
            this.line = builder.line;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public Line getLine() {
            return this.line;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        public static final class Builder {
            private Line line; 
            private Integer position; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.line = model.line;
                this.position = model.position;
            } 

            /**
             * Line.
             */
            public Builder line(Line line) {
                this.line = line;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifySentenceResponseBody} extends {@link TeaModel}
     *
     * <p>VerifySentenceResponseBody</p>
     */
    public static class TargetLine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private java.util.List<String> line;

        private TargetLine(Builder builder) {
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetLine create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public java.util.List<String> getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List<String> line; 

            private Builder() {
            } 

            private Builder(TargetLine model) {
                this.line = model.line;
            } 

            /**
             * Line.
             */
            public Builder line(java.util.List<String> line) {
                this.line = line;
                return this;
            }

            public TargetLine build() {
                return new TargetLine(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifySentenceResponseBody} extends {@link TeaModel}
     *
     * <p>VerifySentenceResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private TargetLine line;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Integer position;

        private Target(Builder builder) {
            this.line = builder.line;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public TargetLine getLine() {
            return this.line;
        }

        /**
         * @return position
         */
        public Integer getPosition() {
            return this.position;
        }

        public static final class Builder {
            private TargetLine line; 
            private Integer position; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.line = model.line;
                this.position = model.position;
            } 

            /**
             * Line.
             */
            public Builder line(TargetLine line) {
                this.line = line;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Integer position) {
                this.position = position;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifySentenceResponseBody} extends {@link TeaModel}
     *
     * <p>VerifySentenceResponseBody</p>
     */
    public static class Delta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Delta(Builder builder) {
            this.source = builder.source;
            this.target = builder.target;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delta create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Source source; 
            private Target target; 
            private String type; 

            private Builder() {
            } 

            private Builder(Delta model) {
                this.source = model.source;
                this.target = model.target;
                this.type = model.type;
            } 

            /**
             * Source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Delta build() {
                return new Delta(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifySentenceResponseBody} extends {@link TeaModel}
     *
     * <p>VerifySentenceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delta")
        private java.util.List<Delta> delta;

        private Data(Builder builder) {
            this.delta = builder.delta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return delta
         */
        public java.util.List<Delta> getDelta() {
            return this.delta;
        }

        public static final class Builder {
            private java.util.List<Delta> delta; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.delta = model.delta;
            } 

            /**
             * Delta.
             */
            public Builder delta(java.util.List<Delta> delta) {
                this.delta = delta;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
