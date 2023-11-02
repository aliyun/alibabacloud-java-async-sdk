// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutomateResponseConfigPlayBooksRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutomateResponseConfigPlayBooksRequest</p>
 */
public class DescribeAutomateResponseConfigPlayBooksRequest extends Request {
    @Body
    @NameInMap("AutoResponseType")
    private String autoResponseType;

    @Body
    @NameInMap("EntityType")
    private String entityType;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAutomateResponseConfigPlayBooksRequest(Builder builder) {
        super(builder);
        this.autoResponseType = builder.autoResponseType;
        this.entityType = builder.entityType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutomateResponseConfigPlayBooksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoResponseType
     */
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAutomateResponseConfigPlayBooksRequest, Builder> {
        private String autoResponseType; 
        private String entityType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutomateResponseConfigPlayBooksRequest request) {
            super(request);
            this.autoResponseType = request.autoResponseType;
            this.entityType = request.entityType;
            this.regionId = request.regionId;
        } 

        /**
         * AutoResponseType.
         */
        public Builder autoResponseType(String autoResponseType) {
            this.putBodyParameter("AutoResponseType", autoResponseType);
            this.autoResponseType = autoResponseType;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAutomateResponseConfigPlayBooksRequest build() {
            return new DescribeAutomateResponseConfigPlayBooksRequest(this);
        } 

    } 

}
