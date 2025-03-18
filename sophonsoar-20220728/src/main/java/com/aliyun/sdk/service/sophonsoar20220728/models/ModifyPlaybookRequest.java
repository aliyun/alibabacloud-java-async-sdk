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
 * {@link ModifyPlaybookRequest} extends {@link RequestModel}
 *
 * <p>ModifyPlaybookRequest</p>
 */
public class ModifyPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Taskflow")
    private String taskflow;

    private ModifyPlaybookRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
        this.taskflow = builder.taskflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPlaybookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return taskflow
     */
    public String getTaskflow() {
        return this.taskflow;
    }

    public static final class Builder extends Request.Builder<ModifyPlaybookRequest, Builder> {
        private String description; 
        private String displayName; 
        private String lang; 
        private String playbookUuid; 
        private String taskflow; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPlaybookRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
            this.taskflow = request.taskflow;
        } 

        /**
         * <p>The description of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>demo test task</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the playbook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_waf_test_playbook</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the UUIDs of playbooks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8baa6cff-319e-4ede-97bc-1586c35e61f8</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The XML configuration of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" encoding="UTF-8"?><p>&lt;bpmn:definitions xmlns:xsi=&quot;<a href="http://www.w3.org/2001/XMLSchema-instance">http://www.w3.org/2001/XMLSchema-instance</a>&quot; xmlns:bpmn=&quot;<a href="http://www.omg.org/spec/BPMN/20100524/MODEL">http://www.omg.org/spec/BPMN/20100524/MODEL</a>&quot; xmlns:bpmndi=&quot;<a href="http://www.omg.org/spec/BPMN/20100524/DI">http://www.omg.org/spec/BPMN/20100524/DI</a>&quot; xmlns:dc=&quot;<a href="http://www.omg.org/spec/DD/20100524/DC">http://www.omg.org/spec/DD/20100524/DC</a>&quot; targetNamespace=&quot;<a href="http://bpmn.io/schema/bpmn">http://bpmn.io/schema/bpmn</a>&quot; id=&quot;Definitions_1&quot;&gt;&lt;bpmn:process id=&quot;Process_1&quot; isExecutable=&quot;false&quot;&gt;&lt;bpmn:startEvent id=&quot;StartEvent_1&quot;/&gt;</bpmn:process>&lt;bpmndi:BPMNDiagram id=&quot;BPMNDiagram_1&quot;&gt;&lt;bpmndi:BPMNPlane id=&quot;BPMNPlane_1&quot; bpmnElement=&quot;Process_1&quot;&gt;&lt;bpmndi:BPMNShape id=&quot;_BPMNShape_StartEvent_2&quot; bpmnElement=&quot;StartEvent_1&quot;&gt;&lt;dc:Bounds height=&quot;36.0&quot; width=&quot;36.0&quot; x=&quot;173.0&quot; y=&quot;102.0&quot;/&gt;</bpmndi:BPMNShape></bpmndi:BPMNPlane></bpmndi:BPMNDiagram></bpmn:definitions></p>
         */
        public Builder taskflow(String taskflow) {
            this.putBodyParameter("Taskflow", taskflow);
            this.taskflow = taskflow;
            return this;
        }

        @Override
        public ModifyPlaybookRequest build() {
            return new ModifyPlaybookRequest(this);
        } 

    } 

}
