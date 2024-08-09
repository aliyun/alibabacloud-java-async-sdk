// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUdfArtifactResult} extends {@link TeaModel}
 *
 * <p>DeleteUdfArtifactResult</p>
 */
public class DeleteUdfArtifactResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deleteSuccess")
    private Boolean deleteSuccess;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("referencedClasses")
    private java.util.List < UdfClass > referencedClasses;

    private DeleteUdfArtifactResult(Builder builder) {
        this.deleteSuccess = builder.deleteSuccess;
        this.message = builder.message;
        this.referencedClasses = builder.referencedClasses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUdfArtifactResult create() {
        return builder().build();
    }

    /**
     * @return deleteSuccess
     */
    public Boolean getDeleteSuccess() {
        return this.deleteSuccess;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return referencedClasses
     */
    public java.util.List < UdfClass > getReferencedClasses() {
        return this.referencedClasses;
    }

    public static final class Builder {
        private Boolean deleteSuccess; 
        private String message; 
        private java.util.List < UdfClass > referencedClasses; 

        /**
         * deleteSuccess.
         */
        public Builder deleteSuccess(Boolean deleteSuccess) {
            this.deleteSuccess = deleteSuccess;
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
         * referencedClasses.
         */
        public Builder referencedClasses(java.util.List < UdfClass > referencedClasses) {
            this.referencedClasses = referencedClasses;
            return this;
        }

        public DeleteUdfArtifactResult build() {
            return new DeleteUdfArtifactResult(this);
        } 

    } 

}
