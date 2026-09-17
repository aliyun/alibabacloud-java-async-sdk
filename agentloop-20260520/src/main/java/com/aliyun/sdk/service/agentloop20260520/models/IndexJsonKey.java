// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link IndexJsonKey} extends {@link TeaModel}
 *
 * <p>IndexJsonKey</p>
 */
public class IndexJsonKey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chn")
    private Boolean chn;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private IndexJsonKey(Builder builder) {
        this.chn = builder.chn;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexJsonKey create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chn
     */
    public Boolean getChn() {
        return this.chn;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean chn; 
        private String type; 

        private Builder() {
        } 

        private Builder(IndexJsonKey model) {
            this.chn = model.chn;
            this.type = model.type;
        } 

        /**
         * <p>Specifies whether the field contains Chinese characters. This parameter is required only when the <strong>type</strong> parameter is set to <strong>text</strong>. Valid values:</p>
         * <ul>
         * <li>true: The field contains Chinese characters.</li>
         * <li>false: The field does not contain Chinese characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder chn(Boolean chn) {
            this.chn = chn;
            return this;
        }

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public IndexJsonKey build() {
            return new IndexJsonKey(this);
        } 

    } 

}
