// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link PaperDescription} extends {@link TeaModel}
 *
 * <p>PaperDescription</p>
 */
public class PaperDescription extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private java.util.List<Summary> description;

    @com.aliyun.core.annotation.NameInMap("TitleID")
    private java.util.List<String> titleID;

    private PaperDescription(Builder builder) {
        this.description = builder.description;
        this.titleID = builder.titleID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaperDescription create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public java.util.List<Summary> getDescription() {
        return this.description;
    }

    /**
     * @return titleID
     */
    public java.util.List<String> getTitleID() {
        return this.titleID;
    }

    public static final class Builder {
        private java.util.List<Summary> description; 
        private java.util.List<String> titleID; 

        private Builder() {
        } 

        private Builder(PaperDescription model) {
            this.description = model.description;
            this.titleID = model.titleID;
        } 

        /**
         * Description.
         */
        public Builder description(java.util.List<Summary> description) {
            this.description = description;
            return this;
        }

        /**
         * TitleID.
         */
        public Builder titleID(java.util.List<String> titleID) {
            this.titleID = titleID;
            return this;
        }

        public PaperDescription build() {
            return new PaperDescription(this);
        } 

    } 

}
