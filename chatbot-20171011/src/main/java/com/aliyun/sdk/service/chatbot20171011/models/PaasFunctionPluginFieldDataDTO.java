// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasFunctionPluginFieldDataDTO} extends {@link TeaModel}
 *
 * <p>PaasFunctionPluginFieldDataDTO</p>
 */
public class PaasFunctionPluginFieldDataDTO extends TeaModel {
    @NameInMap("AliyunFunction")
    private String aliyunFunction;

    @NameInMap("AliyunService")
    private String aliyunService;

    @NameInMap("Code")
    private String code;

    @NameInMap("Description")
    private String description;

    @NameInMap("EndPoint")
    private String endPoint;

    @NameInMap("Function")
    private String function;

    @NameInMap("Name")
    private String name;

    @NameInMap("Params")
    private java.util.Map < String, ? > params;

    @NameInMap("Switch")
    private java.util.List < PaasSwitchCaseDTO > _switch;

    @NameInMap("Type")
    private String type;

    private PaasFunctionPluginFieldDataDTO(Builder builder) {
        this.aliyunFunction = builder.aliyunFunction;
        this.aliyunService = builder.aliyunService;
        this.code = builder.code;
        this.description = builder.description;
        this.endPoint = builder.endPoint;
        this.function = builder.function;
        this.name = builder.name;
        this.params = builder.params;
        this._switch = builder._switch;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasFunctionPluginFieldDataDTO create() {
        return builder().build();
    }

    /**
     * @return aliyunFunction
     */
    public String getAliyunFunction() {
        return this.aliyunFunction;
    }

    /**
     * @return aliyunService
     */
    public String getAliyunService() {
        return this.aliyunService;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endPoint
     */
    public String getEndPoint() {
        return this.endPoint;
    }

    /**
     * @return function
     */
    public String getFunction() {
        return this.function;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return params
     */
    public java.util.Map < String, ? > getParams() {
        return this.params;
    }

    /**
     * @return _switch
     */
    public java.util.List < PaasSwitchCaseDTO > get_switch() {
        return this._switch;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String aliyunFunction; 
        private String aliyunService; 
        private String code; 
        private String description; 
        private String endPoint; 
        private String function; 
        private String name; 
        private java.util.Map < String, ? > params; 
        private java.util.List < PaasSwitchCaseDTO > _switch; 
        private String type; 

        /**
         * AliyunFunction.
         */
        public Builder aliyunFunction(String aliyunFunction) {
            this.aliyunFunction = aliyunFunction;
            return this;
        }

        /**
         * AliyunService.
         */
        public Builder aliyunService(String aliyunService) {
            this.aliyunService = aliyunService;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EndPoint.
         */
        public Builder endPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }

        /**
         * Function.
         */
        public Builder function(String function) {
            this.function = function;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(java.util.Map < String, ? > params) {
            this.params = params;
            return this;
        }

        /**
         * Switch.
         */
        public Builder _switch(java.util.List < PaasSwitchCaseDTO > _switch) {
            this._switch = _switch;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PaasFunctionPluginFieldDataDTO build() {
            return new PaasFunctionPluginFieldDataDTO(this);
        } 

    } 

}
