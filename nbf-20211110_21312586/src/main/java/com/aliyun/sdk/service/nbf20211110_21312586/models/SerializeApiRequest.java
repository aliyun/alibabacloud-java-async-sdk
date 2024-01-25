// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SerializeApiRequest} extends {@link RequestModel}
 *
 * <p>SerializeApiRequest</p>
 */
public class SerializeApiRequest extends Request {
    @Query
    @NameInMap("apiSchemaDTO")
    private String apiSchemaDTO;

    @Query
    @NameInMap("type")
    private String type;

    private SerializeApiRequest(Builder builder) {
        super(builder);
        this.apiSchemaDTO = builder.apiSchemaDTO;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SerializeApiRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SerializeApiRequest, Builder> {
        private String apiSchemaDTO; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SerializeApiRequest request) {
            super(request);
            this.apiSchemaDTO = request.apiSchemaDTO;
            this.type = request.type;
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
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public SerializeApiRequest build() {
            return new SerializeApiRequest(this);
        } 

    } 

}
