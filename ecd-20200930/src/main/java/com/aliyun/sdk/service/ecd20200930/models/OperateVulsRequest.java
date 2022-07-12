// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateVulsRequest} extends {@link RequestModel}
 *
 * <p>OperateVulsRequest</p>
 */
public class OperateVulsRequest extends Request {
    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("OperateType")
    @Validation(required = true)
    private String operateType;

    @Query
    @NameInMap("Precondition")
    @Validation(required = true)
    private Integer precondition;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("VulName")
    @Validation(required = true)
    private java.util.List < String > vulName;

    private OperateVulsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.operateType = builder.operateType;
        this.precondition = builder.precondition;
        this.reason = builder.reason;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.vulName = builder.vulName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateVulsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return precondition
     */
    public Integer getPrecondition() {
        return this.precondition;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vulName
     */
    public java.util.List < String > getVulName() {
        return this.vulName;
    }

    public static final class Builder extends Request.Builder<OperateVulsRequest, Builder> {
        private java.util.List < String > desktopId; 
        private String operateType; 
        private Integer precondition; 
        private String reason; 
        private String regionId; 
        private String type; 
        private java.util.List < String > vulName; 

        private Builder() {
            super();
        } 

        private Builder(OperateVulsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.operateType = request.operateType;
            this.precondition = request.precondition;
            this.reason = request.reason;
            this.regionId = request.regionId;
            this.type = request.type;
            this.vulName = request.vulName;
        } 

        /**
         * DesktopId.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * Precondition.
         */
        public Builder precondition(Integer precondition) {
            this.putQueryParameter("Precondition", precondition);
            this.precondition = precondition;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VulName.
         */
        public Builder vulName(java.util.List < String > vulName) {
            this.putQueryParameter("VulName", vulName);
            this.vulName = vulName;
            return this;
        }

        @Override
        public OperateVulsRequest build() {
            return new OperateVulsRequest(this);
        } 

    } 

}
