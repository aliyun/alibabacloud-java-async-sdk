// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunPython3ScriptRequest} extends {@link RequestModel}
 *
 * <p>RunPython3ScriptRequest</p>
 */
public class RunPython3ScriptRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PythonScript")
    private String pythonScript;

    private RunPython3ScriptRequest(Builder builder) {
        super(builder);
        this.nodeName = builder.nodeName;
        this.params = builder.params;
        this.playbookUuid = builder.playbookUuid;
        this.pythonScript = builder.pythonScript;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPython3ScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return pythonScript
     */
    public String getPythonScript() {
        return this.pythonScript;
    }

    public static final class Builder extends Request.Builder<RunPython3ScriptRequest, Builder> {
        private String nodeName; 
        private String params; 
        private String playbookUuid; 
        private String pythonScript; 

        private Builder() {
            super();
        } 

        private Builder(RunPython3ScriptRequest request) {
            super(request);
            this.nodeName = request.nodeName;
            this.params = request.params;
            this.playbookUuid = request.playbookUuid;
            this.pythonScript = request.pythonScript;
        } 

        /**
         * <p>The name of the node in the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>python3_3</p>
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The input parameters of the Python3 script.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;input1&quot;: &quot;xx.xx.xx.xx&quot;,
         *     &quot;input2&quot;: &quot;7d&quot;
         * }</p>
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the UUIDs of playbooks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8baa6cff-319e-4ede-97bc-xxxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The Python3 script.</p>
         * 
         * <strong>example:</strong>
         * <p>import logging
         * def execute (params):
         *   #ip = params[&quot;ip&quot;]
         *   #logging.info(&quot;enter execute,ip is &quot;+ip)
         *   success=True
         *   message=&quot;OK&quot;
         *   data=[]
         *   return (success,message,data)</p>
         */
        public Builder pythonScript(String pythonScript) {
            this.putBodyParameter("PythonScript", pythonScript);
            this.pythonScript = pythonScript;
            return this;
        }

        @Override
        public RunPython3ScriptRequest build() {
            return new RunPython3ScriptRequest(this);
        } 

    } 

}
