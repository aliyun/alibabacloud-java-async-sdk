// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link PutDataEventSelectorRequest} extends {@link RequestModel}
 *
 * <p>PutDataEventSelectorRequest</p>
 */
public class PutDataEventSelectorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventSelectors")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventSelectors;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsTrailAllRegion")
    private Boolean isTrailAllRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrailName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trailName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrailRegionIds")
    private String trailRegionIds;

    private PutDataEventSelectorRequest(Builder builder) {
        super(builder);
        this.eventSelectors = builder.eventSelectors;
        this.isTrailAllRegion = builder.isTrailAllRegion;
        this.trailName = builder.trailName;
        this.trailRegionIds = builder.trailRegionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDataEventSelectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventSelectors
     */
    public String getEventSelectors() {
        return this.eventSelectors;
    }

    /**
     * @return isTrailAllRegion
     */
    public Boolean getIsTrailAllRegion() {
        return this.isTrailAllRegion;
    }

    /**
     * @return trailName
     */
    public String getTrailName() {
        return this.trailName;
    }

    /**
     * @return trailRegionIds
     */
    public String getTrailRegionIds() {
        return this.trailRegionIds;
    }

    public static final class Builder extends Request.Builder<PutDataEventSelectorRequest, Builder> {
        private String eventSelectors; 
        private Boolean isTrailAllRegion; 
        private String trailName; 
        private String trailRegionIds; 

        private Builder() {
            super();
        } 

        private Builder(PutDataEventSelectorRequest request) {
            super(request);
            this.eventSelectors = request.eventSelectors;
            this.isTrailAllRegion = request.isTrailAllRegion;
            this.trailName = request.trailName;
            this.trailRegionIds = request.trailRegionIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;EventName&quot;:{&quot;Equals&quot;:[&quot;GetObject&quot;,&quot;CopyObject&quot;,&quot;AppendObject&quot;]},&quot;ReadWriteType&quot;:&quot;All&quot;,&quot;ServiceName&quot;:&quot;Oss&quot;}]</p>
         */
        public Builder eventSelectors(String eventSelectors) {
            this.putQueryParameter("EventSelectors", eventSelectors);
            this.eventSelectors = eventSelectors;
            return this;
        }

        /**
         * IsTrailAllRegion.
         */
        public Builder isTrailAllRegion(Boolean isTrailAllRegion) {
            this.putQueryParameter("IsTrailAllRegion", isTrailAllRegion);
            this.isTrailAllRegion = isTrailAllRegion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-name</p>
         */
        public Builder trailName(String trailName) {
            this.putQueryParameter("TrailName", trailName);
            this.trailName = trailName;
            return this;
        }

        /**
         * TrailRegionIds.
         */
        public Builder trailRegionIds(String trailRegionIds) {
            this.putQueryParameter("TrailRegionIds", trailRegionIds);
            this.trailRegionIds = trailRegionIds;
            return this;
        }

        @Override
        public PutDataEventSelectorRequest build() {
            return new PutDataEventSelectorRequest(this);
        } 

    } 

}
