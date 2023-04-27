// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackSuspEventQuaraFileRequest} extends {@link RequestModel}
 *
 * <p>RollbackSuspEventQuaraFileRequest</p>
 */
public class RollbackSuspEventQuaraFileRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    private String desktopId;

    @Query
    @NameInMap("QuaraFieldId")
    @Validation(required = true)
    private Integer quaraFieldId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RollbackSuspEventQuaraFileRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.quaraFieldId = builder.quaraFieldId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackSuspEventQuaraFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return quaraFieldId
     */
    public Integer getQuaraFieldId() {
        return this.quaraFieldId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RollbackSuspEventQuaraFileRequest, Builder> {
        private String desktopId; 
        private Integer quaraFieldId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RollbackSuspEventQuaraFileRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.quaraFieldId = request.quaraFieldId;
            this.regionId = request.regionId;
        } 

        /**
         * DesktopId.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the quarantined file.
         * <p>
         * 
         * You can call the [DescribeSuspEventQuaraFiles](~~217947~~) operation to obtain the ID of the quarantined file.
         */
        public Builder quaraFieldId(Integer quaraFieldId) {
            this.putQueryParameter("QuaraFieldId", quaraFieldId);
            this.quaraFieldId = quaraFieldId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to RollbackSuspEventQuaraFile.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RollbackSuspEventQuaraFileRequest build() {
            return new RollbackSuspEventQuaraFileRequest(this);
        } 

    } 

}
