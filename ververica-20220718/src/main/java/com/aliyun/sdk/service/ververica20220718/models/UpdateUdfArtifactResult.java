// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUdfArtifactResult} extends {@link TeaModel}
 *
 * <p>UpdateUdfArtifactResult</p>
 */
public class UpdateUdfArtifactResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("collidingClasses")
    private java.util.List < UdfClass > collidingClasses;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("missingClasses")
    private java.util.List < UdfClass > missingClasses;

    @com.aliyun.core.annotation.NameInMap("udfArtifact")
    private UdfArtifact udfArtifact;

    @com.aliyun.core.annotation.NameInMap("updateSuccess")
    private Boolean updateSuccess;

    private UpdateUdfArtifactResult(Builder builder) {
        this.collidingClasses = builder.collidingClasses;
        this.message = builder.message;
        this.missingClasses = builder.missingClasses;
        this.udfArtifact = builder.udfArtifact;
        this.updateSuccess = builder.updateSuccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUdfArtifactResult create() {
        return builder().build();
    }

    /**
     * @return collidingClasses
     */
    public java.util.List < UdfClass > getCollidingClasses() {
        return this.collidingClasses;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return missingClasses
     */
    public java.util.List < UdfClass > getMissingClasses() {
        return this.missingClasses;
    }

    /**
     * @return udfArtifact
     */
    public UdfArtifact getUdfArtifact() {
        return this.udfArtifact;
    }

    /**
     * @return updateSuccess
     */
    public Boolean getUpdateSuccess() {
        return this.updateSuccess;
    }

    public static final class Builder {
        private java.util.List < UdfClass > collidingClasses; 
        private String message; 
        private java.util.List < UdfClass > missingClasses; 
        private UdfArtifact udfArtifact; 
        private Boolean updateSuccess; 

        /**
         * collidingClasses.
         */
        public Builder collidingClasses(java.util.List < UdfClass > collidingClasses) {
            this.collidingClasses = collidingClasses;
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
         * missingClasses.
         */
        public Builder missingClasses(java.util.List < UdfClass > missingClasses) {
            this.missingClasses = missingClasses;
            return this;
        }

        /**
         * udfArtifact.
         */
        public Builder udfArtifact(UdfArtifact udfArtifact) {
            this.udfArtifact = udfArtifact;
            return this;
        }

        /**
         * updateSuccess.
         */
        public Builder updateSuccess(Boolean updateSuccess) {
            this.updateSuccess = updateSuccess;
            return this;
        }

        public UpdateUdfArtifactResult build() {
            return new UpdateUdfArtifactResult(this);
        } 

    } 

}
