// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetSkillFileDetectResultRequest} extends {@link RequestModel}
 *
 * <p>GetSkillFileDetectResultRequest</p>
 */
public class GetSkillFileDetectResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HashKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hashKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetSkillFileDetectResultRequest(Builder builder) {
        super(builder);
        this.hashKey = builder.hashKey;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillFileDetectResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hashKey
     */
    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetSkillFileDetectResultRequest, Builder> {
        private String hashKey; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillFileDetectResultRequest request) {
            super(request);
            this.hashKey = request.hashKey;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2aceb074-fa72-44d2-99d9-45b17cffe0e7</p>
         */
        public Builder hashKey(String hashKey) {
            this.putQueryParameter("HashKey", hashKey);
            this.hashKey = hashKey;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetSkillFileDetectResultRequest build() {
            return new GetSkillFileDetectResultRequest(this);
        } 

    } 

}
