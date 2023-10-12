// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeviceForm} extends {@link TeaModel}
 *
 * <p>DeviceForm</p>
 */
public class DeviceForm extends TeaModel {
    @NameInMap("AccountConfig")
    private String accountConfig;

    @NameInMap("ConfigCompare")
    private String configCompare;

    @NameInMap("FormId")
    private String formId;

    @NameInMap("FormName")
    private String formName;

    @NameInMap("PropertiesList")
    private java.util.List < DeviceFormProperty > propertiesList;

    private DeviceForm(Builder builder) {
        this.accountConfig = builder.accountConfig;
        this.configCompare = builder.configCompare;
        this.formId = builder.formId;
        this.formName = builder.formName;
        this.propertiesList = builder.propertiesList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceForm create() {
        return builder().build();
    }

    /**
     * @return accountConfig
     */
    public String getAccountConfig() {
        return this.accountConfig;
    }

    /**
     * @return configCompare
     */
    public String getConfigCompare() {
        return this.configCompare;
    }

    /**
     * @return formId
     */
    public String getFormId() {
        return this.formId;
    }

    /**
     * @return formName
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * @return propertiesList
     */
    public java.util.List < DeviceFormProperty > getPropertiesList() {
        return this.propertiesList;
    }

    public static final class Builder {
        private String accountConfig; 
        private String configCompare; 
        private String formId; 
        private String formName; 
        private java.util.List < DeviceFormProperty > propertiesList; 

        /**
         * AccountConfig.
         */
        public Builder accountConfig(String accountConfig) {
            this.accountConfig = accountConfig;
            return this;
        }

        /**
         * ConfigCompare.
         */
        public Builder configCompare(String configCompare) {
            this.configCompare = configCompare;
            return this;
        }

        /**
         * FormId.
         */
        public Builder formId(String formId) {
            this.formId = formId;
            return this;
        }

        /**
         * FormName.
         */
        public Builder formName(String formName) {
            this.formName = formName;
            return this;
        }

        /**
         * PropertiesList.
         */
        public Builder propertiesList(java.util.List < DeviceFormProperty > propertiesList) {
            this.propertiesList = propertiesList;
            return this;
        }

        public DeviceForm build() {
            return new DeviceForm(this);
        } 

    } 

}
