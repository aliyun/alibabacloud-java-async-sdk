// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link DeleteAnswerLibRequest} extends {@link RequestModel}
 *
 * <p>DeleteAnswerLibRequest</p>
 */
public class DeleteAnswerLibRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteAnswerLibRequest(Builder builder) {
        super(builder);
        this.libId = builder.libId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAnswerLibRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAnswerLibRequest, Builder> {
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAnswerLibRequest request) {
            super(request);
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the proxy answer library.</p>
         * 
         * <strong>example:</strong>
         * <p>alxxx</p>
         */
        public Builder libId(String libId) {
            this.putQueryParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteAnswerLibRequest build() {
            return new DeleteAnswerLibRequest(this);
        } 

    } 

}
