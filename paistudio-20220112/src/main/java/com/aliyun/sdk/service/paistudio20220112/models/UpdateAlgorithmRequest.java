// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlgorithmRequest</p>
 */
public class UpdateAlgorithmRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlgorithmDescription")
    private String algorithmDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    private UpdateAlgorithmRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.algorithmDescription = builder.algorithmDescription;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlgorithmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return algorithmDescription
     */
    public String getAlgorithmDescription() {
        return this.algorithmDescription;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    public static final class Builder extends Request.Builder<UpdateAlgorithmRequest, Builder> {
        private String algorithmId; 
        private String algorithmDescription; 
        private String displayName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlgorithmRequest request) {
            super(request);
            this.algorithmId = request.algorithmId;
            this.algorithmDescription = request.algorithmDescription;
            this.displayName = request.displayName;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.putPathParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * AlgorithmDescription.
         */
        public Builder algorithmDescription(String algorithmDescription) {
            this.putBodyParameter("AlgorithmDescription", algorithmDescription);
            this.algorithmDescription = algorithmDescription;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        @Override
        public UpdateAlgorithmRequest build() {
            return new UpdateAlgorithmRequest(this);
        } 

    } 

}
