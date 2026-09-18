// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link ListSubTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubTasksResponseBody</p>
 */
public class ListSubTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSubTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSubTasksResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of task results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9FDE3D6F-26BD-5937-B0E5-8F47962B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSubTasksResponseBody build() {
            return new ListSubTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        private Detail(Builder builder) {
            this.content = builder.content;
            this.description = builder.description;
            this.itemName = builder.itemName;
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        public static final class Builder {
            private String content; 
            private String description; 
            private String itemName; 
            private String line; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.content = model.content;
                this.description = model.description;
                this.itemName = model.itemName;
                this.line = model.line;
            } 

            /**
             * <p>The detected content.</p>
             * 
             * <strong>example:</strong>
             * <p>allowed-tools: Bash(agent-browser:*)</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>The skill configuration allows Bash execution via agent-browser:* pattern without requiring user confirmation. This enables potentially dangerous command execution through the browser automation CLI.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The check item name.</p>
             * 
             * <strong>example:</strong>
             * <p>Dangerous Tools Without Confirmation</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The line number of the detected content.</p>
             * 
             * <strong>example:</strong>
             * <p>2555</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        private Config(Builder builder) {
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<Detail> getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private java.util.List<Detail> detail; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.detail = model.detail;
            } 

            /**
             * <p>The list of risk details.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 
            private String level; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
                this.level = model.level;
            } 

            /**
             * <p>The confidence score. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The result description.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspicious attacks.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label information.</p>
             * 
             * <strong>example:</strong>
             * <p>attack</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong>: High risk.</li>
             * <li><strong>medium</strong>: Medium risk.</li>
             * <li><strong>low</strong>: Low risk.</li>
             * <li><strong>none</strong>: No risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class GuardrailDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GuardrailDetail(Builder builder) {
            this.level = builder.level;
            this.result = builder.result;
            this.suggestion = builder.suggestion;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuardrailDetail create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level; 
            private java.util.List<Result> result; 
            private String suggestion; 
            private String type; 

            private Builder() {
            } 

            private Builder(GuardrailDetail model) {
                this.level = model.level;
                this.result = model.result;
                this.suggestion = model.suggestion;
                this.type = model.type;
            } 

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong>: High risk.</li>
             * <li><strong>medium</strong>: Medium risk.</li>
             * <li><strong>low</strong>: Low risk.</li>
             * <li><strong>none</strong>: No risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The list of result details.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The processing suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The risk type.</p>
             * 
             * <strong>example:</strong>
             * <p>promptAttack</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GuardrailDetail build() {
                return new GuardrailDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Guardrail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<GuardrailDetail> detail;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Guardrail(Builder builder) {
            this.detail = builder.detail;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Guardrail create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<GuardrailDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private java.util.List<GuardrailDetail> detail; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(Guardrail model) {
                this.detail = model.detail;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The list of risk details.</p>
             */
            public Builder detail(java.util.List<GuardrailDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The processing suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Guardrail build() {
                return new Guardrail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class SensitiveDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<String> result;

        private SensitiveDetail(Builder builder) {
            this.desc = builder.desc;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveDetail create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return result
         */
        public java.util.List<String> getResult() {
            return this.result;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List<String> result; 

            private Builder() {
            } 

            private Builder(SensitiveDetail model) {
                this.desc = model.desc;
                this.result = model.result;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_ak_24</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The list of sensitive information.</p>
             */
            public Builder result(java.util.List<String> result) {
                this.result = result;
                return this;
            }

            public SensitiveDetail build() {
                return new SensitiveDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Sensitive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<SensitiveDetail> detail;

        private Sensitive(Builder builder) {
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sensitive create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<SensitiveDetail> getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private java.util.List<SensitiveDetail> detail; 

            private Builder() {
            } 

            private Builder(Sensitive model) {
                this.detail = model.detail;
            } 

            /**
             * <p>The list of risk details.</p>
             */
            public Builder detail(java.util.List<SensitiveDetail> detail) {
                this.detail = detail;
                return this;
            }

            public Sensitive build() {
                return new Sensitive(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Virus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Virus(Builder builder) {
            this.ext = builder.ext;
            this.score = builder.score;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Virus create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ext; 
            private Integer score; 
            private String type; 

            private Builder() {
            } 

            private Builder(Virus model) {
                this.ext = model.ext;
                this.score = model.score;
                this.type = model.type;
            } 

            /**
             * <p>The extended information field. This is a reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The risk score. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The virus type.</p>
             * 
             * <strong>example:</strong>
             * <p>Backdoor</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Virus build() {
                return new Virus(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("Guardrail")
        private Guardrail guardrail;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
        private Sensitive sensitive;

        @com.aliyun.core.annotation.NameInMap("Virus")
        private java.util.List<Virus> virus;

        private Ext(Builder builder) {
            this.config = builder.config;
            this.guardrail = builder.guardrail;
            this.sensitive = builder.sensitive;
            this.virus = builder.virus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return guardrail
         */
        public Guardrail getGuardrail() {
            return this.guardrail;
        }

        /**
         * @return sensitive
         */
        public Sensitive getSensitive() {
            return this.sensitive;
        }

        /**
         * @return virus
         */
        public java.util.List<Virus> getVirus() {
            return this.virus;
        }

        public static final class Builder {
            private Config config; 
            private Guardrail guardrail; 
            private Sensitive sensitive; 
            private java.util.List<Virus> virus; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.config = model.config;
                this.guardrail = model.guardrail;
                this.sensitive = model.sensitive;
                this.virus = model.virus;
            } 

            /**
             * <p>The configuration detection risks.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The safety guardrail detection risks.</p>
             */
            public Builder guardrail(Guardrail guardrail) {
                this.guardrail = guardrail;
                return this;
            }

            /**
             * <p>The sensitive information risks.</p>
             */
            public Builder sensitive(Sensitive sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The virus detection risks.</p>
             */
            public Builder virus(java.util.List<Virus> virus) {
                this.virus = virus;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class RiskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private Ext ext;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("ResultType")
        private String resultType;

        private RiskInfo(Builder builder) {
            this.ext = builder.ext;
            this.path = builder.path;
            this.resultType = builder.resultType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskInfo create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public Ext getExt() {
            return this.ext;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return resultType
         */
        public String getResultType() {
            return this.resultType;
        }

        public static final class Builder {
            private Ext ext; 
            private String path; 
            private String resultType; 

            private Builder() {
            } 

            private Builder(RiskInfo model) {
                this.ext = model.ext;
                this.path = model.path;
                this.resultType = model.resultType;
            } 

            /**
             * <p>The file detection risk list.</p>
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/97e55e6af371836f/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The result type.</p>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder resultType(String resultType) {
                this.resultType = resultType;
                return this;
            }

            public RiskInfo build() {
                return new RiskInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class SkillCheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskInfo")
        private java.util.List<RiskInfo> riskInfo;

        private SkillCheckResult(Builder builder) {
            this.riskInfo = builder.riskInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillCheckResult create() {
            return builder().build();
        }

        /**
         * @return riskInfo
         */
        public java.util.List<RiskInfo> getRiskInfo() {
            return this.riskInfo;
        }

        public static final class Builder {
            private java.util.List<RiskInfo> riskInfo; 

            private Builder() {
            } 

            private Builder(SkillCheckResult model) {
                this.riskInfo = model.riskInfo;
            } 

            /**
             * <p>The file detection risk information.</p>
             */
            public Builder riskInfo(java.util.List<RiskInfo> riskInfo) {
                this.riskInfo = riskInfo;
                return this;
            }

            public SkillCheckResult build() {
                return new SkillCheckResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class TaskResultMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillCheckResult")
        private SkillCheckResult skillCheckResult;

        private TaskResultMessage(Builder builder) {
            this.skillCheckResult = builder.skillCheckResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskResultMessage create() {
            return builder().build();
        }

        /**
         * @return skillCheckResult
         */
        public SkillCheckResult getSkillCheckResult() {
            return this.skillCheckResult;
        }

        public static final class Builder {
            private SkillCheckResult skillCheckResult; 

            private Builder() {
            } 

            private Builder(TaskResultMessage model) {
                this.skillCheckResult = model.skillCheckResult;
            } 

            /**
             * <p>The skill check task result.</p>
             */
            public Builder skillCheckResult(SkillCheckResult skillCheckResult) {
                this.skillCheckResult = skillCheckResult;
                return this;
            }

            public TaskResultMessage build() {
                return new TaskResultMessage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileHash")
        private String fileHash;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TaskResultMessage")
        private TaskResultMessage taskResultMessage;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.fileHash = builder.fileHash;
            this.id = builder.id;
            this.target = builder.target;
            this.taskResultMessage = builder.taskResultMessage;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileHash
         */
        public String getFileHash() {
            return this.fileHash;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return taskResultMessage
         */
        public TaskResultMessage getTaskResultMessage() {
            return this.taskResultMessage;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String fileHash; 
            private Long id; 
            private String target; 
            private TaskResultMessage taskResultMessage; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileHash = model.fileHash;
                this.id = model.id;
                this.target = model.target;
                this.taskResultMessage = model.taskResultMessage;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>The hash value of the uploaded file.</p>
             * 
             * <strong>example:</strong>
             * <p>03d1f08455e965cac0351eaa59256fd9</p>
             */
            public Builder fileHash(String fileHash) {
                this.fileHash = fileHash;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4190063324899520</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The detection target.</p>
             * 
             * <strong>example:</strong>
             * <p>c7acb2f1264e4467887ef8f4c36c44ca1</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The task result information.</p>
             */
            public Builder taskResultMessage(TaskResultMessage taskResultMessage) {
                this.taskResultMessage = taskResultMessage;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of data entries displayed on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records in the query result.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
