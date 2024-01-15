// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopOversoldGroupSaleRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopOversoldGroupSaleRequest</p>
 */
public class ModifyDesktopOversoldGroupSaleRequest extends Request {
    @Query
    @NameInMap("ConcurrenceCount")
    private Integer concurrenceCount;

    @Query
    @NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @Query
    @NameInMap("OversoldUserCount")
    private Integer oversoldUserCount;

    private ModifyDesktopOversoldGroupSaleRequest(Builder builder) {
        super(builder);
        this.concurrenceCount = builder.concurrenceCount;
        this.oversoldGroupId = builder.oversoldGroupId;
        this.oversoldUserCount = builder.oversoldUserCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopOversoldGroupSaleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrenceCount
     */
    public Integer getConcurrenceCount() {
        return this.concurrenceCount;
    }

    /**
     * @return oversoldGroupId
     */
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    /**
     * @return oversoldUserCount
     */
    public Integer getOversoldUserCount() {
        return this.oversoldUserCount;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopOversoldGroupSaleRequest, Builder> {
        private Integer concurrenceCount; 
        private String oversoldGroupId; 
        private Integer oversoldUserCount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopOversoldGroupSaleRequest request) {
            super(request);
            this.concurrenceCount = request.concurrenceCount;
            this.oversoldGroupId = request.oversoldGroupId;
            this.oversoldUserCount = request.oversoldUserCount;
        } 

        /**
         * ConcurrenceCount.
         */
        public Builder concurrenceCount(Integer concurrenceCount) {
            this.putQueryParameter("ConcurrenceCount", concurrenceCount);
            this.concurrenceCount = concurrenceCount;
            return this;
        }

        /**
         * OversoldGroupId.
         */
        public Builder oversoldGroupId(String oversoldGroupId) {
            this.putQueryParameter("OversoldGroupId", oversoldGroupId);
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }

        /**
         * OversoldUserCount.
         */
        public Builder oversoldUserCount(Integer oversoldUserCount) {
            this.putQueryParameter("OversoldUserCount", oversoldUserCount);
            this.oversoldUserCount = oversoldUserCount;
            return this;
        }

        @Override
        public ModifyDesktopOversoldGroupSaleRequest build() {
            return new ModifyDesktopOversoldGroupSaleRequest(this);
        } 

    } 

}
