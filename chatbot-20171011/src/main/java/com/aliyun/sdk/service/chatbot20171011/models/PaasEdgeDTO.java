// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasEdgeDTO} extends {@link TeaModel}
 *
 * <p>PaasEdgeDTO</p>
 */
public class PaasEdgeDTO extends TeaModel {
    @NameInMap("Id")
    private String id;

    @NameInMap("Label")
    private String label;

    @NameInMap("Source")
    private String source;

    @NameInMap("Target")
    private String target;

    private PaasEdgeDTO(Builder builder) {
        this.id = builder.id;
        this.label = builder.label;
        this.source = builder.source;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasEdgeDTO create() {
        return builder().build();
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder {
        private String id; 
        private String label; 
        private String source; 
        private String target; 

        /**
         * Id
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Label
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Source
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Target
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        public PaasEdgeDTO build() {
            return new PaasEdgeDTO(this);
        } 

    } 

}
