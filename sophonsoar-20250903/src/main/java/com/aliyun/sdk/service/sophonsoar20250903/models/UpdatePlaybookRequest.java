// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link UpdatePlaybookRequest} extends {@link RequestModel}
 *
 * <p>UpdatePlaybookRequest</p>
 */
public class UpdatePlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookDescription")
    private String playbookDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookInputConfigs")
    private java.util.List<FieldInputConfig> playbookInputConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookName")
    private String playbookName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookOutputConfigs")
    private java.util.List<FieldOutputConfig> playbookOutputConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookParamType")
    private String playbookParamType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookTaskFlow")
    private String playbookTaskFlow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdatePlaybookRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.playbookDescription = builder.playbookDescription;
        this.playbookInputConfigs = builder.playbookInputConfigs;
        this.playbookName = builder.playbookName;
        this.playbookOutputConfigs = builder.playbookOutputConfigs;
        this.playbookParamType = builder.playbookParamType;
        this.playbookTaskFlow = builder.playbookTaskFlow;
        this.playbookUuid = builder.playbookUuid;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePlaybookRequest create() {
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
     * @return playbookDescription
     */
    public String getPlaybookDescription() {
        return this.playbookDescription;
    }

    /**
     * @return playbookInputConfigs
     */
    public java.util.List<FieldInputConfig> getPlaybookInputConfigs() {
        return this.playbookInputConfigs;
    }

    /**
     * @return playbookName
     */
    public String getPlaybookName() {
        return this.playbookName;
    }

    /**
     * @return playbookOutputConfigs
     */
    public java.util.List<FieldOutputConfig> getPlaybookOutputConfigs() {
        return this.playbookOutputConfigs;
    }

    /**
     * @return playbookParamType
     */
    public String getPlaybookParamType() {
        return this.playbookParamType;
    }

    /**
     * @return playbookTaskFlow
     */
    public String getPlaybookTaskFlow() {
        return this.playbookTaskFlow;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<UpdatePlaybookRequest, Builder> {
        private String lang; 
        private String playbookDescription; 
        private java.util.List<FieldInputConfig> playbookInputConfigs; 
        private String playbookName; 
        private java.util.List<FieldOutputConfig> playbookOutputConfigs; 
        private String playbookParamType; 
        private String playbookTaskFlow; 
        private String playbookUuid; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePlaybookRequest request) {
            super(request);
            this.lang = request.lang;
            this.playbookDescription = request.playbookDescription;
            this.playbookInputConfigs = request.playbookInputConfigs;
            this.playbookName = request.playbookName;
            this.playbookOutputConfigs = request.playbookOutputConfigs;
            this.playbookParamType = request.playbookParamType;
            this.playbookTaskFlow = request.playbookTaskFlow;
            this.playbookUuid = request.playbookUuid;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The language type for requests and received messages. Values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>Description of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>alb block</p>
         */
        public Builder playbookDescription(String playbookDescription) {
            this.putBodyParameter("PlaybookDescription", playbookDescription);
            this.playbookDescription = playbookDescription;
            return this;
        }

        /**
         * <p>List of input parameter configurations for the playbook.</p>
         */
        public Builder playbookInputConfigs(java.util.List<FieldInputConfig> playbookInputConfigs) {
            String playbookInputConfigsShrink = shrink(playbookInputConfigs, "PlaybookInputConfigs", "json");
            this.putBodyParameter("PlaybookInputConfigs", playbookInputConfigsShrink);
            this.playbookInputConfigs = playbookInputConfigs;
            return this;
        }

        /**
         * <p>The name of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>system_aliyun_alb_process_book</p>
         */
        public Builder playbookName(String playbookName) {
            this.putBodyParameter("PlaybookName", playbookName);
            this.playbookName = playbookName;
            return this;
        }

        /**
         * <p>List of output parameter configurations for the playbook.</p>
         */
        public Builder playbookOutputConfigs(java.util.List<FieldOutputConfig> playbookOutputConfigs) {
            String playbookOutputConfigsShrink = shrink(playbookOutputConfigs, "PlaybookOutputConfigs", "json");
            this.putBodyParameter("PlaybookOutputConfigs", playbookOutputConfigsShrink);
            this.playbookOutputConfigs = playbookOutputConfigs;
            return this;
        }

        /**
         * <p>Type of input parameters for the playbook.</p>
         * <ul>
         * <li><strong>template-ip</strong>: IP entity.</li>
         * <li><strong>template-file</strong>: File entity.</li>
         * <li><strong>template-process</strong>: Process entity.</li>
         * <li><strong>template-host</strong>: Host entity.</li>
         * <li><strong>template-domain</strong>: Domain entity.</li>
         * <li><strong>template-container</strong>: Container entity.</li>
         * <li><strong>template-incident</strong>: Security incident.</li>
         * <li><strong>template-alert</strong>: Security alert.</li>
         * <li><strong>custom</strong>: Custom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>template-ip</p>
         */
        public Builder playbookParamType(String playbookParamType) {
            this.putBodyParameter("PlaybookParamType", playbookParamType);
            this.playbookParamType = playbookParamType;
            return this;
        }

        /**
         * <p>Content of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;58d87b7d-28d9-4f0e-b135-4adc4f1a70e4&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;nodeType&quot;:&quot;startEvent&quot;,&quot;appType&quot;:&quot;basic&quot;,&quot;nodeName&quot;:&quot;start&quot;,&quot;icon&quot;:&quot;icon-circle&quot;,&quot;description&quot;:&quot;start&quot;},&quot;position&quot;:{&quot;x&quot;:-440,&quot;y&quot;:-170}},{&quot;id&quot;:&quot;5293c3f9-e1c9-4a49-b0eb-635067dc67e8&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;nodeType&quot;:&quot;sequenceFlow&quot;,&quot;appType&quot;:&quot;basic&quot;,&quot;icon&quot;:&quot;icon-upper-right-arrow&quot;,&quot;isRequired&quot;:true},&quot;source&quot;:{&quot;cell&quot;:&quot;58d87b7d-28d9-4f0e-b135-4adc4f1a70e4&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;f9d6d1f5-b0cd-45b6-93d0-02cd4b2a6fa2&quot;},&quot;vertices&quot;:[]},{&quot;id&quot;:&quot;317dd1be-2d20-460e-977e-1fc936ffb583&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;nodeType&quot;:&quot;endEvent&quot;,&quot;appType&quot;:&quot;basic&quot;,&quot;nodeName&quot;:&quot;end&quot;,&quot;icon&quot;:&quot;icon-radio-off-full&quot;,&quot;description&quot;:&quot;end&quot;},&quot;position&quot;:{&quot;x&quot;:-140,&quot;y&quot;:-170}},{&quot;id&quot;:&quot;f9d6d1f5-b0cd-45b6-93d0-02cd4b2a6fa2&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;isDebug&quot;:false,&quot;nodeType&quot;:&quot;action&quot;,&quot;appType&quot;:&quot;component&quot;,&quot;nodeName&quot;:&quot;data&quot;,&quot;valueData&quot;:{&quot;outputFields&quot;:&quot;[{&quot;fieldName&quot;:&quot;ip&quot;,&quot;fieldValue&quot;:&quot;${event.ip}&quot;}]&quot;},&quot;icon&quot;:&quot;<a href="https://img.alicdn.com/imgextra/i2/O1CN01NCKmL026m1z8o0DeN_!!6000000007703-2-tps-248-248.png%22,%22description%22:%22%22,%22advance%22:%7B%22inputParamMode%22:false,%22onError%22:%22stop_cur_flow%22,%22rspStatusType%22:3,%22rspStatusThreshold%22:0%7D,%22componentName%22:%22DataFormat%22,%22actionName%22:%22formatdata%22%7D,%22position%22:%7B%22x%22:-340,%22y%22:-185%7D%7D,%7B%22id%22:%221c7f0021-fb93-4478-b10f-af78dd5a69d6%22,%22zIndex%22:1,%22data%22:%7B%22nodeType%22:%22sequenceFlow%22,%22appType%22:%22basic%22,%22icon%22:%22icon-upper-right-arrow%22,%22isRequired%22:true%7D,%22source%22:%7B%22cell%22:%22f9d6d1f5-b0cd-45b6-93d0-02cd4b2a6fa2%22%7D,%22target%22:%7B%22cell%22:%22317dd1be-2d20-460e-977e-1fc936ffb583%22%7D,%22vertices%22:%5B%5D%7D%5D">https://img.alicdn.com/imgextra/i2/O1CN01NCKmL026m1z8o0DeN_!!6000000007703-2-tps-248-248.png&quot;,&quot;description&quot;:&quot;&quot;,&quot;advance&quot;:{&quot;inputParamMode&quot;:false,&quot;onError&quot;:&quot;stop_cur_flow&quot;,&quot;rspStatusType&quot;:3,&quot;rspStatusThreshold&quot;:0},&quot;componentName&quot;:&quot;DataFormat&quot;,&quot;actionName&quot;:&quot;formatdata&quot;},&quot;position&quot;:{&quot;x&quot;:-340,&quot;y&quot;:-185}},{&quot;id&quot;:&quot;1c7f0021-fb93-4478-b10f-af78dd5a69d6&quot;,&quot;zIndex&quot;:1,&quot;data&quot;:{&quot;nodeType&quot;:&quot;sequenceFlow&quot;,&quot;appType&quot;:&quot;basic&quot;,&quot;icon&quot;:&quot;icon-upper-right-arrow&quot;,&quot;isRequired&quot;:true},&quot;source&quot;:{&quot;cell&quot;:&quot;f9d6d1f5-b0cd-45b6-93d0-02cd4b2a6fa2&quot;},&quot;target&quot;:{&quot;cell&quot;:&quot;317dd1be-2d20-460e-977e-1fc936ffb583&quot;},&quot;vertices&quot;:[]}]</a></p>
         */
        public Builder playbookTaskFlow(String playbookTaskFlow) {
            this.putBodyParameter("PlaybookTaskFlow", playbookTaskFlow);
            this.playbookTaskFlow = playbookTaskFlow;
            return this;
        }

        /**
         * <p>UUID of the playbook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8f55e76d-b5d5-4720-9cd7-xxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The user ID for the administrator to switch to another member&quot;s perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>13760*****718726</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public UpdatePlaybookRequest build() {
            return new UpdatePlaybookRequest(this);
        } 

    } 

}
