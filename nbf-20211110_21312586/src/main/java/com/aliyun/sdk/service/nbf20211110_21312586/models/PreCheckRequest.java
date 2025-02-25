// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreCheckRequest} extends {@link RequestModel}
 *
 * <p>PreCheckRequest</p>
 */
public class PreCheckRequest extends Request {
    @Query
    @NameInMap("apiSchemaDTO")
    @Validation(required = true)
    private String apiSchemaDTO;

    @Query
    @NameInMap("groupVersionExtraInfo")
    @Validation(required = true)
    private String groupVersionExtraInfo;

    @Query
    @NameInMap("namespaceExternalId")
    @Validation(required = true)
    private String namespaceExternalId;

    private PreCheckRequest(Builder builder) {
        super(builder);
        this.apiSchemaDTO = builder.apiSchemaDTO;
        this.groupVersionExtraInfo = builder.groupVersionExtraInfo;
        this.namespaceExternalId = builder.namespaceExternalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiSchemaDTO
     */
    public String getApiSchemaDTO() {
        return this.apiSchemaDTO;
    }

    /**
     * @return groupVersionExtraInfo
     */
    public String getGroupVersionExtraInfo() {
        return this.groupVersionExtraInfo;
    }

    /**
     * @return namespaceExternalId
     */
    public String getNamespaceExternalId() {
        return this.namespaceExternalId;
    }

    public static final class Builder extends Request.Builder<PreCheckRequest, Builder> {
        private String apiSchemaDTO; 
        private String groupVersionExtraInfo; 
        private String namespaceExternalId; 

        private Builder() {
            super();
        } 

        private Builder(PreCheckRequest request) {
            super(request);
            this.apiSchemaDTO = request.apiSchemaDTO;
            this.groupVersionExtraInfo = request.groupVersionExtraInfo;
            this.namespaceExternalId = request.namespaceExternalId;
        } 

        /**
         * apiSchemaDTO.
         */
        public Builder apiSchemaDTO(String apiSchemaDTO) {
            this.putQueryParameter("apiSchemaDTO", apiSchemaDTO);
            this.apiSchemaDTO = apiSchemaDTO;
            return this;
        }

        /**
         * groupVersionExtraInfo.
         */
        public Builder groupVersionExtraInfo(String groupVersionExtraInfo) {
            this.putQueryParameter("groupVersionExtraInfo", groupVersionExtraInfo);
            this.groupVersionExtraInfo = groupVersionExtraInfo;
            return this;
        }

        /**
         * namespaceExternalId.
         */
        public Builder namespaceExternalId(String namespaceExternalId) {
            this.putQueryParameter("namespaceExternalId", namespaceExternalId);
            this.namespaceExternalId = namespaceExternalId;
            return this;
        }

        @Override
        public PreCheckRequest build() {
            return new PreCheckRequest(this);
        } 

    } 

}
