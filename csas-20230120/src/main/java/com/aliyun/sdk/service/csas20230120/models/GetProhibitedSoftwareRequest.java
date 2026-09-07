// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetProhibitedSoftwareRequest} extends {@link RequestModel}
 *
 * <p>GetProhibitedSoftwareRequest</p>
 */
public class GetProhibitedSoftwareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareId")
    private SoftwareId softwareId;

    private GetProhibitedSoftwareRequest(Builder builder) {
        super(builder);
        this.softwareId = builder.softwareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProhibitedSoftwareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return softwareId
     */
    public SoftwareId getSoftwareId() {
        return this.softwareId;
    }

    public static final class Builder extends Request.Builder<GetProhibitedSoftwareRequest, Builder> {
        private SoftwareId softwareId; 

        private Builder() {
            super();
        } 

        private Builder(GetProhibitedSoftwareRequest request) {
            super(request);
            this.softwareId = request.softwareId;
        } 

        /**
         * <p>The prohibited software ID.</p>
         */
        public Builder softwareId(SoftwareId softwareId) {
            String softwareIdShrink = shrink(softwareId, "SoftwareId", "json");
            this.putQueryParameter("SoftwareId", softwareIdShrink);
            this.softwareId = softwareId;
            return this;
        }

        @Override
        public GetProhibitedSoftwareRequest build() {
            return new GetProhibitedSoftwareRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetProhibitedSoftwareRequest} extends {@link TeaModel}
     *
     * <p>GetProhibitedSoftwareRequest</p>
     */
    public static class SoftwareId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        private SoftwareId(Builder builder) {
            this.isDefault = builder.isDefault;
            this.softwareId = builder.softwareId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareId create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private String softwareId; 

            private Builder() {
            } 

            private Builder(SoftwareId model) {
                this.isDefault = model.isDefault;
                this.softwareId = model.softwareId;
            } 

            /**
             * <p>Indicates whether the prohibited software is a system built-in prohibited software. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A system built-in prohibited software that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
             * <li><strong>false</strong>: A custom prohibited software under the current Alibaba Cloud account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The prohibited software ID. You can obtain the value from the following operations:</p>
             * <ul>
             * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: Lists prohibited software.</li>
             * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Creates custom prohibited software.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>swb-3e6a1f9c4b28****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            public SoftwareId build() {
                return new SoftwareId(this);
            } 

        } 

    }
}
