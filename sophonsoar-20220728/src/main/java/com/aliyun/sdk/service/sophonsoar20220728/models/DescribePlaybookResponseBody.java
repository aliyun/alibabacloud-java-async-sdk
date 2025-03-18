// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribePlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookResponseBody</p>
 */
public class DescribePlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Playbook")
    private Playbook playbook;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlaybookResponseBody(Builder builder) {
        this.playbook = builder.playbook;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playbook
     */
    public Playbook getPlaybook() {
        return this.playbook;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Playbook playbook; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePlaybookResponseBody model) {
            this.playbook = model.playbook;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration of the playbook.</p>
         */
        public Builder playbook(Playbook playbook) {
            this.playbook = playbook;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2989BC59-E9F0-5C83-B453-B368857649C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookResponseBody build() {
            return new DescribePlaybookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlaybookResponseBody</p>
     */
    public static class Playbook extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FailExeNum")
        private Integer failExeNum;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InputParams")
        private String inputParams;

        @com.aliyun.core.annotation.NameInMap("LastExeTime")
        private Long lastExeTime;

        @com.aliyun.core.annotation.NameInMap("OnlineActive")
        private Boolean onlineActive;

        @com.aliyun.core.annotation.NameInMap("OnlineReleaseTaskflowMd5")
        private String onlineReleaseTaskflowMd5;

        @com.aliyun.core.annotation.NameInMap("OwnType")
        private String ownType;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        @com.aliyun.core.annotation.NameInMap("SuccessExeNum")
        private Integer successExeNum;

        @com.aliyun.core.annotation.NameInMap("Taskflow")
        private String taskflow;

        @com.aliyun.core.annotation.NameInMap("TaskflowType")
        private String taskflowType;

        private Playbook(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.failExeNum = builder.failExeNum;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.inputParams = builder.inputParams;
            this.lastExeTime = builder.lastExeTime;
            this.onlineActive = builder.onlineActive;
            this.onlineReleaseTaskflowMd5 = builder.onlineReleaseTaskflowMd5;
            this.ownType = builder.ownType;
            this.playbookUuid = builder.playbookUuid;
            this.successExeNum = builder.successExeNum;
            this.taskflow = builder.taskflow;
            this.taskflowType = builder.taskflowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Playbook create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return failExeNum
         */
        public Integer getFailExeNum() {
            return this.failExeNum;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return inputParams
         */
        public String getInputParams() {
            return this.inputParams;
        }

        /**
         * @return lastExeTime
         */
        public Long getLastExeTime() {
            return this.lastExeTime;
        }

        /**
         * @return onlineActive
         */
        public Boolean getOnlineActive() {
            return this.onlineActive;
        }

        /**
         * @return onlineReleaseTaskflowMd5
         */
        public String getOnlineReleaseTaskflowMd5() {
            return this.onlineReleaseTaskflowMd5;
        }

        /**
         * @return ownType
         */
        public String getOwnType() {
            return this.ownType;
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        /**
         * @return successExeNum
         */
        public Integer getSuccessExeNum() {
            return this.successExeNum;
        }

        /**
         * @return taskflow
         */
        public String getTaskflow() {
            return this.taskflow;
        }

        /**
         * @return taskflowType
         */
        public String getTaskflowType() {
            return this.taskflowType;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private Integer failExeNum; 
            private String gmtCreate; 
            private String gmtModified; 
            private String inputParams; 
            private Long lastExeTime; 
            private Boolean onlineActive; 
            private String onlineReleaseTaskflowMd5; 
            private String ownType; 
            private String playbookUuid; 
            private Integer successExeNum; 
            private String taskflow; 
            private String taskflowType; 

            private Builder() {
            } 

            private Builder(Playbook model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.failExeNum = model.failExeNum;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.inputParams = model.inputParams;
                this.lastExeTime = model.lastExeTime;
                this.onlineActive = model.onlineActive;
                this.onlineReleaseTaskflowMd5 = model.onlineReleaseTaskflowMd5;
                this.ownType = model.ownType;
                this.playbookUuid = model.playbookUuid;
                this.successExeNum = model.successExeNum;
                this.taskflow = model.taskflow;
                this.taskflowType = model.taskflowType;
            } 

            /**
             * <p>The description of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>demo playbook</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The number of times that the playbook failed to be run.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failExeNum(Integer failExeNum) {
                this.failExeNum = failExeNum;
                return this;
            }

            /**
             * <p>The creation time of the playbook. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1665288858000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time of the playbook. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1677482519000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The input parameter configuration of the playbook. The value is a JSON array.</p>
             * <blockquote>
             * <p> For more information, see <a href="~~DescribePlaybookInputOutput~~">DescribePlaybookInputOutput</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;typeName&quot;: &quot;String&quot;,
             *         &quot;dataClass&quot;: &quot;normal&quot;,
             *         &quot;dataType&quot;: &quot;String&quot;,
             *         &quot;description&quot;: &quot;period&quot;,
             *         &quot;example&quot;: &quot;&quot;,
             *         &quot;name&quot;: &quot;period&quot;,
             *         &quot;required&quot;: false
             *     }
             * ]</p>
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * <p>The time when the playbook was last run. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1665288858000</p>
             */
            public Builder lastExeTime(Long lastExeTime) {
                this.lastExeTime = lastExeTime;
                return this;
            }

            /**
             * <p>The status of the playbook. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onlineActive(Boolean onlineActive) {
                this.onlineActive = onlineActive;
                return this;
            }

            /**
             * <p>The MD5 hash value in the latest published version of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>asdfsdfe232-e2b2-44fd-b2cc-xxxxx</p>
             */
            public Builder onlineReleaseTaskflowMd5(String onlineReleaseTaskflowMd5) {
                this.onlineReleaseTaskflowMd5 = onlineReleaseTaskflowMd5;
                return this;
            }

            /**
             * <p>The type of the playbook. Valid values:</p>
             * <ul>
             * <li><strong>preset</strong>: predefined playbook</li>
             * <li><strong>user</strong>: custom playbook</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preset</p>
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * <p>The UUID of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>8db257d3-e2b2-44fd-b2cc-xxxxx</p>
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * <p>The number of times that the playbook was successfully run.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder successExeNum(Integer successExeNum) {
                this.successExeNum = successExeNum;
                return this;
            }

            /**
             * <p>The XML configuration of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <?xml version="1.0" encoding="UTF-8"?><p>&lt;bpmn:definitions xmlns:xsi=&quot;<a href="http://www.w3.org/2001/XMLSchema-instance">http://www.w3.org/2001/XMLSchema-instance</a>&quot; xmlns:bpmn=&quot;<a href="http://www.omg.org/spec/BPMN/20100524/MODEL">http://www.omg.org/spec/BPMN/20100524/MODEL</a>&quot; xmlns:bpmndi=&quot;<a href="http://www.omg.org/spec/BPMN/20100524/DI">http://www.omg.org/spec/BPMN/20100524/DI</a>&quot; xmlns:dc=&quot;<a href="http://www.omg.org/spec/DD/20100524/DC">http://www.omg.org/spec/DD/20100524/DC</a>&quot; targetNamespace=&quot;<a href="http://bpmn.io/schema/bpmn">http://bpmn.io/schema/bpmn</a>&quot; id=&quot;Definitions_1&quot;&gt;&lt;bpmn:process id=&quot;Process_1&quot; isExecutable=&quot;false&quot;&gt;&lt;bpmn:startEvent id=&quot;StartEvent_1&quot;/&gt;</bpmn:process>&lt;bpmndi:BPMNDiagram id=&quot;BPMNDiagram_1&quot;&gt;&lt;bpmndi:BPMNPlane id=&quot;BPMNPlane_1&quot; bpmnElement=&quot;Process_1&quot;&gt;&lt;bpmndi:BPMNShape id=&quot;_BPMNShape_StartEvent_2&quot; bpmnElement=&quot;StartEvent_1&quot;&gt;&lt;dc:Bounds height=&quot;36.0&quot; width=&quot;36.0&quot; x=&quot;173.0&quot; y=&quot;102.0&quot;/&gt;</bpmndi:BPMNShape></bpmndi:BPMNPlane></bpmndi:BPMNDiagram></bpmn:definitions></p>
             */
            public Builder taskflow(String taskflow) {
                this.taskflow = taskflow;
                return this;
            }

            /**
             * <p>The playbook configuration type.</p>
             * <ul>
             * <li><strong>xml</strong>: XML format.</li>
             * <li><strong>x6</strong>: JSON format.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>xml</p>
             */
            public Builder taskflowType(String taskflowType) {
                this.taskflowType = taskflowType;
                return this;
            }

            public Playbook build() {
                return new Playbook(this);
            } 

        } 

    }
}
