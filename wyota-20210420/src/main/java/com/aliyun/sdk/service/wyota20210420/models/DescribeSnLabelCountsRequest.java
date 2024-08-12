// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnLabelCountsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnLabelCountsRequest</p>
 */
public class DescribeSnLabelCountsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelList")
    private java.util.List < String > labelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private DescribeSnLabelCountsRequest(Builder builder) {
        super(builder);
        this.labelList = builder.labelList;
        this.tenantId = builder.tenantId;
        this.zoneId = builder.zoneId;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnLabelCountsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelList
     */
    public java.util.List < String > getLabelList() {
        return this.labelList;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<DescribeSnLabelCountsRequest, Builder> {
        private java.util.List < String > labelList; 
        private String tenantId; 
        private String zoneId; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnLabelCountsRequest request) {
            super(request);
            this.labelList = request.labelList;
            this.tenantId = request.tenantId;
            this.zoneId = request.zoneId;
            this.zoneName = request.zoneName;
        } 

        /**
         * LabelList.
         */
        public Builder labelList(java.util.List < String > labelList) {
            this.putBodyParameter("LabelList", labelList);
            this.labelList = labelList;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.putBodyParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public DescribeSnLabelCountsRequest build() {
            return new DescribeSnLabelCountsRequest(this);
        } 

    } 

}
