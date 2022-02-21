// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePerspectiveRequest} extends {@link RequestModel}
 *
 * <p>UpdatePerspectiveRequest</p>
 */
public class UpdatePerspectiveRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PerspectiveId")
    @Validation(required = true)
    private String perspectiveId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdatePerspectiveRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.perspectiveId = builder.perspectiveId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePerspectiveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return perspectiveId
     */
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdatePerspectiveRequest, Builder> {
        private String name; 
        private String perspectiveId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePerspectiveRequest response) {
            super(response);
            this.name = response.name;
            this.perspectiveId = response.perspectiveId;
            this.regionId = response.regionId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PerspectiveId.
         */
        public Builder perspectiveId(String perspectiveId) {
            this.putQueryParameter("PerspectiveId", perspectiveId);
            this.perspectiveId = perspectiveId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdatePerspectiveRequest build() {
            return new UpdatePerspectiveRequest(this);
        } 

    } 

}
