// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The name of the node in the playbook.
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The input parameters of the Python3 script.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * The UUID of the playbook.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the UUIDs of playbooks.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * The Python3 script.
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
