// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProductComponentVersionRequest} extends {@link RequestModel}
 *
 * <p>AddProductComponentVersionRequest</p>
 */
public class AddProductComponentVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("componentVersionUID")
    @Validation(required = true)
    private String componentVersionUID;

    @Body
    @NameInMap("componentVersionSpecUID")
    private String componentVersionSpecUID;

    @Body
    @NameInMap("componentVersionSpecValues")
    private String componentVersionSpecValues;

    @Body
    @NameInMap("releaseName")
    private String releaseName;

    private AddProductComponentVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.componentVersionUID = builder.componentVersionUID;
        this.componentVersionSpecUID = builder.componentVersionSpecUID;
        this.componentVersionSpecValues = builder.componentVersionSpecValues;
        this.releaseName = builder.releaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProductComponentVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return componentVersionUID
     */
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    /**
     * @return componentVersionSpecUID
     */
    public String getComponentVersionSpecUID() {
        return this.componentVersionSpecUID;
    }

    /**
     * @return componentVersionSpecValues
     */
    public String getComponentVersionSpecValues() {
        return this.componentVersionSpecValues;
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    public static final class Builder extends Request.Builder<AddProductComponentVersionRequest, Builder> {
        private String uid; 
        private String componentVersionUID; 
        private String componentVersionSpecUID; 
        private String componentVersionSpecValues; 
        private String releaseName; 

        private Builder() {
            super();
        } 

        private Builder(AddProductComponentVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.componentVersionUID = request.componentVersionUID;
            this.componentVersionSpecUID = request.componentVersionSpecUID;
            this.componentVersionSpecValues = request.componentVersionSpecValues;
            this.releaseName = request.releaseName;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * componentVersionUID.
         */
        public Builder componentVersionUID(String componentVersionUID) {
            this.putPathParameter("componentVersionUID", componentVersionUID);
            this.componentVersionUID = componentVersionUID;
            return this;
        }

        /**
         * componentVersionSpecUID.
         */
        public Builder componentVersionSpecUID(String componentVersionSpecUID) {
            this.putBodyParameter("componentVersionSpecUID", componentVersionSpecUID);
            this.componentVersionSpecUID = componentVersionSpecUID;
            return this;
        }

        /**
         * componentVersionSpecValues.
         */
        public Builder componentVersionSpecValues(String componentVersionSpecValues) {
            this.putBodyParameter("componentVersionSpecValues", componentVersionSpecValues);
            this.componentVersionSpecValues = componentVersionSpecValues;
            return this;
        }

        /**
         * releaseName.
         */
        public Builder releaseName(String releaseName) {
            this.putBodyParameter("releaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        @Override
        public AddProductComponentVersionRequest build() {
            return new AddProductComponentVersionRequest(this);
        } 

    } 

}
