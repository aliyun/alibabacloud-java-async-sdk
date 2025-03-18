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
 * {@link DebugPlaybookRequest} extends {@link RequestModel}
 *
 * <p>DebugPlaybookRequest</p>
 */
public class DebugPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Record")
    private String record;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Taskflow")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskflow;

    private DebugPlaybookRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
        this.record = builder.record;
        this.taskflow = builder.taskflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugPlaybookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return record
     */
    public String getRecord() {
        return this.record;
    }

    /**
     * @return taskflow
     */
    public String getTaskflow() {
        return this.taskflow;
    }

    public static final class Builder extends Request.Builder<DebugPlaybookRequest, Builder> {
        private String lang; 
        private String playbookUuid; 
        private String record; 
        private String taskflow; 

        private Builder() {
            super();
        } 

        private Builder(DebugPlaybookRequest request) {
            super(request);
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
            this.record = request.record;
            this.taskflow = request.taskflow;
        } 

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
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
         * <p>The playbook UUID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f916b93e-e814-459f-9662-xxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The input parameters that you use to debug the playbook. You can define the parameters based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *    &quot;param1&quot;:&quot;a&quot;,
         *    &quot;param2&quot;:&quot;b&quot;
         * }</p>
         */
        public Builder record(String record) {
            this.putBodyParameter("Record", record);
            this.record = record;
            return this;
        }

        /**
         * <p>The XML configuration of the playbook.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybook~~">DescribePlaybook</a> operation to query the XML configuration of the playbook.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
        public DebugPlaybookRequest build() {
            return new DebugPlaybookRequest(this);
        } 

    } 

}
