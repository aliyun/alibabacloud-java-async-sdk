// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNextResultToVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>GetNextResultToVerifyResponseBody</p>
 */
public class GetNextResultToVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetNextResultToVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNextResultToVerifyResponseBody create() {
        return builder().build();
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetNextResultToVerifyResponseBody build() {
            return new GetNextResultToVerifyResponseBody(this);
        } 

    } 

    public static class Line extends TeaModel {
        @NameInMap("Line")
        private java.util.List < String > line;

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
        public java.util.List < String > getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List < String > line; 

            /**
             * Line.
             */
            public Builder line(java.util.List < String > line) {
                this.line = line;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
    public static class Source extends TeaModel {
        @NameInMap("Line")
        private Line line;

        @NameInMap("Position")
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
    public static class TargetLine extends TeaModel {
        @NameInMap("Line")
        private java.util.List < String > line;

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
        public java.util.List < String > getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List < String > line; 

            /**
             * Line.
             */
            public Builder line(java.util.List < String > line) {
                this.line = line;
                return this;
            }

            public TargetLine build() {
                return new TargetLine(this);
            } 

        } 

    }
    public static class Target extends TeaModel {
        @NameInMap("Line")
        private TargetLine line;

        @NameInMap("Position")
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
    public static class Delta extends TeaModel {
        @NameInMap("Source")
        private Source source;

        @NameInMap("Target")
        private Target target;

        @NameInMap("Type")
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
    public static class Deltas extends TeaModel {
        @NameInMap("Delta")
        private java.util.List < Delta> delta;

        private Deltas(Builder builder) {
            this.delta = builder.delta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deltas create() {
            return builder().build();
        }

        /**
         * @return delta
         */
        public java.util.List < Delta> getDelta() {
            return this.delta;
        }

        public static final class Builder {
            private java.util.List < Delta> delta; 

            /**
             * Delta.
             */
            public Builder delta(java.util.List < Delta> delta) {
                this.delta = delta;
                return this;
            }

            public Deltas build() {
                return new Deltas(this);
            } 

        } 

    }
    public static class Dialogue extends TeaModel {
        @NameInMap("Begin")
        private Long begin;

        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("Deltas")
        private Deltas deltas;

        @NameInMap("EmotionValue")
        private Integer emotionValue;

        @NameInMap("End")
        private Long end;

        @NameInMap("HourMinSec")
        private String hourMinSec;

        @NameInMap("Identity")
        private String identity;

        @NameInMap("IncorrectWords")
        private Integer incorrectWords;

        @NameInMap("Role")
        private String role;

        @NameInMap("SilenceDuration")
        private Integer silenceDuration;

        @NameInMap("SourceRole")
        private String sourceRole;

        @NameInMap("SourceWords")
        private String sourceWords;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Words")
        private String words;

        private Dialogue(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.deltas = builder.deltas;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.hourMinSec = builder.hourMinSec;
            this.identity = builder.identity;
            this.incorrectWords = builder.incorrectWords;
            this.role = builder.role;
            this.silenceDuration = builder.silenceDuration;
            this.sourceRole = builder.sourceRole;
            this.sourceWords = builder.sourceWords;
            this.speechRate = builder.speechRate;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogue create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return deltas
         */
        public Deltas getDeltas() {
            return this.deltas;
        }

        /**
         * @return emotionValue
         */
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return hourMinSec
         */
        public String getHourMinSec() {
            return this.hourMinSec;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return incorrectWords
         */
        public Integer getIncorrectWords() {
            return this.incorrectWords;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return silenceDuration
         */
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return sourceRole
         */
        public String getSourceRole() {
            return this.sourceRole;
        }

        /**
         * @return sourceWords
         */
        public String getSourceWords() {
            return this.sourceWords;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Long begin; 
            private String beginTime; 
            private Deltas deltas; 
            private Integer emotionValue; 
            private Long end; 
            private String hourMinSec; 
            private String identity; 
            private Integer incorrectWords; 
            private String role; 
            private Integer silenceDuration; 
            private String sourceRole; 
            private String sourceWords; 
            private Integer speechRate; 
            private String words; 

            /**
             * Begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * Deltas.
             */
            public Builder deltas(Deltas deltas) {
                this.deltas = deltas;
                return this;
            }

            /**
             * EmotionValue.
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * HourMinSec.
             */
            public Builder hourMinSec(String hourMinSec) {
                this.hourMinSec = hourMinSec;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
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
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SilenceDuration.
             */
            public Builder silenceDuration(Integer silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * SourceRole.
             */
            public Builder sourceRole(String sourceRole) {
                this.sourceRole = sourceRole;
                return this;
            }

            /**
             * SourceWords.
             */
            public Builder sourceWords(String sourceWords) {
                this.sourceWords = sourceWords;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Words.
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public Dialogue build() {
                return new Dialogue(this);
            } 

        } 

    }
    public static class Dialogues extends TeaModel {
        @NameInMap("Dialogue")
        private java.util.List < Dialogue> dialogue;

        private Dialogues(Builder builder) {
            this.dialogue = builder.dialogue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogues create() {
            return builder().build();
        }

        /**
         * @return dialogue
         */
        public java.util.List < Dialogue> getDialogue() {
            return this.dialogue;
        }

        public static final class Builder {
            private java.util.List < Dialogue> dialogue; 

            /**
             * Dialogue.
             */
            public Builder dialogue(java.util.List < Dialogue> dialogue) {
                this.dialogue = dialogue;
                return this;
            }

            public Dialogues build() {
                return new Dialogues(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AudioScheme")
        private String audioScheme;

        @NameInMap("AudioURL")
        private String audioURL;

        @NameInMap("Dialogues")
        private Dialogues dialogues;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("FileId")
        private String fileId;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("IncorrectWords")
        private Integer incorrectWords;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Precision")
        private Float precision;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Verified")
        private Boolean verified;

        @NameInMap("VerifiedCount")
        private Integer verifiedCount;

        private Data(Builder builder) {
            this.audioScheme = builder.audioScheme;
            this.audioURL = builder.audioURL;
            this.dialogues = builder.dialogues;
            this.duration = builder.duration;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.incorrectWords = builder.incorrectWords;
            this.index = builder.index;
            this.precision = builder.precision;
            this.status = builder.status;
            this.totalCount = builder.totalCount;
            this.updateTime = builder.updateTime;
            this.verified = builder.verified;
            this.verifiedCount = builder.verifiedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioScheme
         */
        public String getAudioScheme() {
            return this.audioScheme;
        }

        /**
         * @return audioURL
         */
        public String getAudioURL() {
            return this.audioURL;
        }

        /**
         * @return dialogues
         */
        public Dialogues getDialogues() {
            return this.dialogues;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return incorrectWords
         */
        public Integer getIncorrectWords() {
            return this.incorrectWords;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return precision
         */
        public Float getPrecision() {
            return this.precision;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return verified
         */
        public Boolean getVerified() {
            return this.verified;
        }

        /**
         * @return verifiedCount
         */
        public Integer getVerifiedCount() {
            return this.verifiedCount;
        }

        public static final class Builder {
            private String audioScheme; 
            private String audioURL; 
            private Dialogues dialogues; 
            private Integer duration; 
            private String fileId; 
            private String fileName; 
            private Integer incorrectWords; 
            private Integer index; 
            private Float precision; 
            private Integer status; 
            private Integer totalCount; 
            private String updateTime; 
            private Boolean verified; 
            private Integer verifiedCount; 

            /**
             * AudioScheme.
             */
            public Builder audioScheme(String audioScheme) {
                this.audioScheme = audioScheme;
                return this;
            }

            /**
             * AudioURL.
             */
            public Builder audioURL(String audioURL) {
                this.audioURL = audioURL;
                return this;
            }

            /**
             * Dialogues.
             */
            public Builder dialogues(Dialogues dialogues) {
                this.dialogues = dialogues;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
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
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Precision.
             */
            public Builder precision(Float precision) {
                this.precision = precision;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Verified.
             */
            public Builder verified(Boolean verified) {
                this.verified = verified;
                return this;
            }

            /**
             * VerifiedCount.
             */
            public Builder verifiedCount(Integer verifiedCount) {
                this.verifiedCount = verifiedCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
