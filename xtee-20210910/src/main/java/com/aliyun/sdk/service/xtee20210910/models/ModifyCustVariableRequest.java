// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link ModifyCustVariableRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustVariableRequest</p>
 */
public class ModifyCustVariableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("outputs")
    private String outputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private ModifyCustVariableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.condition = builder.condition;
        this.dataVersion = builder.dataVersion;
        this.description = builder.description;
        this.eventCodes = builder.eventCodes;
        this.id = builder.id;
        this.name = builder.name;
        this.outputs = builder.outputs;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustVariableRequest create() {
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
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return dataVersion
     */
    public Long getDataVersion() {
        return this.dataVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<ModifyCustVariableRequest, Builder> {
        private String lang; 
        private String condition; 
        private Long dataVersion; 
        private String description; 
        private String eventCodes; 
        private Long id; 
        private String name; 
        private String outputs; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustVariableRequest request) {
            super(request);
            this.lang = request.lang;
            this.condition = request.condition;
            this.dataVersion = request.dataVersion;
            this.description = request.description;
            this.eventCodes = request.eventCodes;
            this.id = request.id;
            this.name = request.name;
            this.outputs = request.outputs;
            this.regId = request.regId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>Condition value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;currentId&quot;:1,&quot;deepCount&quot;:0,&quot;list&quot;:[{&quot;currentId&quot;:2,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;__hit_rules&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:true,&quot;name&quot;:&quot;hitRules&quot;,&quot;operatorCode&quot;:&quot;deNotInNameList&quot;},&quot;operatorCode&quot;:&quot;deNotInNameList&quot;,&quot;parentId&quot;:1,&quot;right&quot;:{&quot;code&quot;:&quot;&quot;nl_Xcufc8wV6624&quot;&quot;,&quot;name&quot;:&quot;nl_Xcufc8wV6624&quot;,&quot;rightVariableType&quot;:&quot;variable&quot;}},{&quot;currentId&quot;:3,&quot;deepCount&quot;:1,&quot;list&quot;:[{&quot;currentId&quot;:4,&quot;deepCount&quot;:2,&quot;left&quot;:{&quot;code&quot;:&quot;__v_safde&quot;,&quot;fieldType&quot;:&quot;DOUBLE&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:true,&quot;name&quot;:&quot;score&quot;,&quot;operatorCode&quot;:&quot;equals&quot;},&quot;operatorCode&quot;:&quot;equals&quot;,&quot;parentId&quot;:3,&quot;right&quot;:{&quot;code&quot;:&quot;&quot;99&quot;&quot;,&quot;name&quot;:&quot;99&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;}},{&quot;currentId&quot;:5,&quot;deepCount&quot;:2,&quot;left&quot;:{&quot;code&quot;:&quot;queryPhoneSimulatorInfo(deviceToken)?&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:false,&quot;name&quot;:&quot;<strong>device-test01</strong>&quot;,&quot;operatorCode&quot;:&quot;isNotEmptyWrapper&quot;},&quot;operatorCode&quot;:&quot;isNotEmptyWrapper&quot;,&quot;parentId&quot;:3,&quot;right&quot;:{&quot;functionName&quot;:&quot;&quot;,&quot;name&quot;:&quot;&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;}}],&quot;parentId&quot;:1,&quot;relationship&quot;:&quot;and&quot;}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;}</p>
         */
        public Builder condition(String condition) {
            this.putQueryParameter("condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>Data version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder dataVersion(Long dataVersion) {
            this.putQueryParameter("dataVersion", dataVersion);
            this.dataVersion = dataVersion;
            return this;
        }

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Event code.</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse_pro,account_abuse</p>
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * <p>Variable ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>376773</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Variable name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dxkkLw8fe18</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Output</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        public Builder outputs(String outputs) {
            this.putQueryParameter("outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public ModifyCustVariableRequest build() {
            return new ModifyCustVariableRequest(this);
        } 

    } 

}
