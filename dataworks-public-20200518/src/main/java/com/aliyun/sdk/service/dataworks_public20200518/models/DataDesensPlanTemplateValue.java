// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DataDesensPlanTemplateValue} extends {@link TeaModel}
 *
 * <p>DataDesensPlanTemplateValue</p>
 */
public class DataDesensPlanTemplateValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("SupportWaterMark")
    private Boolean supportWaterMark;

    @com.aliyun.core.annotation.NameInMap("ExtParamTemplate")
    private java.util.List<?> extParamTemplate;

    private DataDesensPlanTemplateValue(Builder builder) {
        this.name = builder.name;
        this.supportWaterMark = builder.supportWaterMark;
        this.extParamTemplate = builder.extParamTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataDesensPlanTemplateValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return supportWaterMark
     */
    public Boolean getSupportWaterMark() {
        return this.supportWaterMark;
    }

    /**
     * @return extParamTemplate
     */
    public java.util.List<?> getExtParamTemplate() {
        return this.extParamTemplate;
    }

    public static final class Builder {
        private String name; 
        private Boolean supportWaterMark; 
        private java.util.List<?> extParamTemplate; 

        private Builder() {
        } 

        private Builder(DataDesensPlanTemplateValue model) {
            this.name = model.name;
            this.supportWaterMark = model.supportWaterMark;
            this.extParamTemplate = model.extParamTemplate;
        } 

        /**
         * <p>The name of the data masking method.</p>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether a watermark is added. Valid values:</p>
         * <ul>
         * <li>true: allow</li>
         * <li>false: disallow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportWaterMark(Boolean supportWaterMark) {
            this.supportWaterMark = supportWaterMark;
            return this;
        }

        /**
         * <p>The data masking parameters and their descriptions.</p>
         */
        public Builder extParamTemplate(java.util.List<?> extParamTemplate) {
            this.extParamTemplate = extParamTemplate;
            return this;
        }

        public DataDesensPlanTemplateValue build() {
            return new DataDesensPlanTemplateValue(this);
        } 

    } 

}
