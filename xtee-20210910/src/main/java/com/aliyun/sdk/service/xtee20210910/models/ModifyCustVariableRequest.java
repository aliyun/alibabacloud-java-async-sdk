// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * condition.
         */
        public Builder condition(String condition) {
            this.putQueryParameter("condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * dataVersion.
         */
        public Builder dataVersion(Long dataVersion) {
            this.putQueryParameter("dataVersion", dataVersion);
            this.dataVersion = dataVersion;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * eventCodes.
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * outputs.
         */
        public Builder outputs(String outputs) {
            this.putQueryParameter("outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * regId.
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
