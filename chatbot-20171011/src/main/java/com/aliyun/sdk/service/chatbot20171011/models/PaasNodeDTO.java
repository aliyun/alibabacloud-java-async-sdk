// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasNodeDTO} extends {@link TeaModel}
 *
 * <p>PaasNodeDTO</p>
 */
public class PaasNodeDTO extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Id")
    private String id;

    @NameInMap("Label")
    private String label;

    @NameInMap("PluginData")
    private PaasPluginDataDTO pluginData;

    @NameInMap("Xx")
    private Double xx;

    @NameInMap("Yy")
    private Double yy;

    private PaasNodeDTO(Builder builder) {
        this.code = builder.code;
        this.id = builder.id;
        this.label = builder.label;
        this.pluginData = builder.pluginData;
        this.xx = builder.xx;
        this.yy = builder.yy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasNodeDTO create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return pluginData
     */
    public PaasPluginDataDTO getPluginData() {
        return this.pluginData;
    }

    /**
     * @return xx
     */
    public Double getXx() {
        return this.xx;
    }

    /**
     * @return yy
     */
    public Double getYy() {
        return this.yy;
    }

    public static final class Builder {
        private String code; 
        private String id; 
        private String label; 
        private PaasPluginDataDTO pluginData; 
        private Double xx; 
        private Double yy; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * PluginData.
         */
        public Builder pluginData(PaasPluginDataDTO pluginData) {
            this.pluginData = pluginData;
            return this;
        }

        /**
         * Xx.
         */
        public Builder xx(Double xx) {
            this.xx = xx;
            return this;
        }

        /**
         * Yy.
         */
        public Builder yy(Double yy) {
            this.yy = yy;
            return this;
        }

        public PaasNodeDTO build() {
            return new PaasNodeDTO(this);
        } 

    } 

}
