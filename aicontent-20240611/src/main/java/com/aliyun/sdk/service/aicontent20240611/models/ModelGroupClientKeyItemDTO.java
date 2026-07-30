// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelGroupClientKeyItemDTO} extends {@link TeaModel}
 *
 * <p>ModelGroupClientKeyItemDTO</p>
 */
public class ModelGroupClientKeyItemDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("keyPreview")
    private String keyPreview;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ModelGroupClientKeyItemDTO(Builder builder) {
        this.id = builder.id;
        this.keyPreview = builder.keyPreview;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelGroupClientKeyItemDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return keyPreview
     */
    public String getKeyPreview() {
        return this.keyPreview;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private Long id; 
        private String keyPreview; 
        private String name; 

        private Builder() {
        } 

        private Builder(ModelGroupClientKeyItemDTO model) {
            this.id = model.id;
            this.keyPreview = model.keyPreview;
            this.name = model.name;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * keyPreview.
         */
        public Builder keyPreview(String keyPreview) {
            this.keyPreview = keyPreview;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ModelGroupClientKeyItemDTO build() {
            return new ModelGroupClientKeyItemDTO(this);
        } 

    } 

}
