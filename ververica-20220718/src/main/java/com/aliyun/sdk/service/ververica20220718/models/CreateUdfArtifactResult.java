// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUdfArtifactResult} extends {@link TeaModel}
 *
 * <p>CreateUdfArtifactResult</p>
 */
public class CreateUdfArtifactResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("collidingClasses")
    private java.util.List < UdfClass > collidingClasses;

    @com.aliyun.core.annotation.NameInMap("createSuccess")
    private Boolean createSuccess;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("udfArtifact")
    private UdfArtifact udfArtifact;

    private CreateUdfArtifactResult(Builder builder) {
        this.collidingClasses = builder.collidingClasses;
        this.createSuccess = builder.createSuccess;
        this.message = builder.message;
        this.udfArtifact = builder.udfArtifact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUdfArtifactResult create() {
        return builder().build();
    }

    /**
     * @return collidingClasses
     */
    public java.util.List < UdfClass > getCollidingClasses() {
        return this.collidingClasses;
    }

    /**
     * @return createSuccess
     */
    public Boolean getCreateSuccess() {
        return this.createSuccess;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return udfArtifact
     */
    public UdfArtifact getUdfArtifact() {
        return this.udfArtifact;
    }

    public static final class Builder {
        private java.util.List < UdfClass > collidingClasses; 
        private Boolean createSuccess; 
        private String message; 
        private UdfArtifact udfArtifact; 

        /**
         * collidingClasses.
         */
        public Builder collidingClasses(java.util.List < UdfClass > collidingClasses) {
            this.collidingClasses = collidingClasses;
            return this;
        }

        /**
         * createSuccess.
         */
        public Builder createSuccess(Boolean createSuccess) {
            this.createSuccess = createSuccess;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * udfArtifact.
         */
        public Builder udfArtifact(UdfArtifact udfArtifact) {
            this.udfArtifact = udfArtifact;
            return this;
        }

        public CreateUdfArtifactResult build() {
            return new CreateUdfArtifactResult(this);
        } 

    } 

}
