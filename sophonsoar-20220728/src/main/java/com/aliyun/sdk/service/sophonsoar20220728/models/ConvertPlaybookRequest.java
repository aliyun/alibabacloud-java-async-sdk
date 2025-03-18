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
 * {@link ConvertPlaybookRequest} extends {@link RequestModel}
 *
 * <p>ConvertPlaybookRequest</p>
 */
public class ConvertPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Taskflow")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskflow;

    private ConvertPlaybookRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.taskflow = builder.taskflow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertPlaybookRequest create() {
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
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return taskflow
     */
    public String getTaskflow() {
        return this.taskflow;
    }

    public static final class Builder extends Request.Builder<ConvertPlaybookRequest, Builder> {
        private String lang; 
        private Long roleFor; 
        private String roleType; 
        private String taskflow; 

        private Builder() {
            super();
        } 

        private Builder(ConvertPlaybookRequest request) {
            super(request);
            this.lang = request.lang;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.taskflow = request.taskflow;
        } 

        /**
         * <p>Language type for request and response messages. Values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>User ID for the administrator to switch to another member&quot;s perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>13760*****718726</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putQueryParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>View type. Values:</p>
         * <ul>
         * <li>0: Current Alibaba Cloud account view.</li>
         * <li>1: View for all accounts under the enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>XML configuration information for playbook orchestration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <?xml version=\"1.0\" encoding=\"UTF-8\"?>
         * <p>&lt;bpmn:definitions xmlns:xsi=&quot;<a href="http://www.w3.org/2001/XMLSchema-instance%5C">http://www.w3.org/2001/XMLSchema-instance\</a>&quot; xmlns:bpmn=&quot;<a href="http://www.omg.org/spec/BPMN/20100524/MODEL%5C">http://www.omg.org/spec/BPMN/20100524/MODEL\</a>&quot; xmlns:bpmndi=&quot;<a href="http://www.omg.org/spec/BPMN/20100524/DI%5C">http://www.omg.org/spec/BPMN/20100524/DI\</a>&quot; xmlns:dc=&quot;<a href="http://www.omg.org/spec/DD/20100524/DC%5C">http://www.omg.org/spec/DD/20100524/DC\</a>&quot; id=&quot;Definitions_1&quot; targetNamespace=&quot;<a href="http://bpmn.io/schema/bpmn%5C%22%3E">http://bpmn.io/schema/bpmn\&quot;&gt;</a>
         *   &lt;bpmn:process id=&quot;Process_1&quot; isExecutable=&quot;false&quot;&gt;
         *     &lt;bpmn:startEvent id=&quot;StartEvent_1&quot; /&gt;
         *   </bpmn:process>
         *   &lt;bpmndi:BPMNDiagram id=&quot;BPMNDiagram_1&quot;&gt;
         *      &lt;bpmndi:BPMNPlane id=&quot;BPMNPlane_1&quot; bpmnElement=&quot;Process_1&quot;&gt;
         *            &lt;bpmndi:BPMNShape id=&quot;_BPMNShape_StartEvent_2&quot; bpmnElement=&quot;StartEvent_1&quot;&gt;
         *                    &lt;dc:Bounds x=&quot;173&quot; y=&quot;102&quot; width=&quot;36&quot; height=&quot;36&quot; /&gt;
         *             </bpmndi:BPMNShape>
         *      </bpmndi:BPMNPlane>
         *   </bpmndi:BPMNDiagram>
         * </bpmn:definitions></p>
         */
        public Builder taskflow(String taskflow) {
            this.putBodyParameter("Taskflow", taskflow);
            this.taskflow = taskflow;
            return this;
        }

        @Override
        public ConvertPlaybookRequest build() {
            return new ConvertPlaybookRequest(this);
        } 

    } 

}
