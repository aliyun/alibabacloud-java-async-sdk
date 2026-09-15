// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeUuidVulNumClassifyStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribeUuidVulNumClassifyStatisticRequest</p>
 */
public class DescribeUuidVulNumClassifyStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageVul")
    private Boolean imageVul;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 10240)
    private String uuids;

    private DescribeUuidVulNumClassifyStatisticRequest(Builder builder) {
        super(builder);
        this.imageVul = builder.imageVul;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUuidVulNumClassifyStatisticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageVul
     */
    public Boolean getImageVul() {
        return this.imageVul;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeUuidVulNumClassifyStatisticRequest, Builder> {
        private Boolean imageVul; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUuidVulNumClassifyStatisticRequest request) {
            super(request);
            this.imageVul = request.imageVul;
            this.uuids = request.uuids;
        } 

        /**
         * <p>Specifies whether to query image vulnerability statistics. Valid values:</p>
         * <ul>
         * <li>true: The Uuids parameter specifies image IDs.</li>
         * <li>false: The Uuids parameter specifies host UUIDs.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder imageVul(Boolean imageVul) {
            this.putQueryParameter("ImageVul", imageVul);
            this.imageVul = imageVul;
            return this;
        }

        /**
         * <p>The unique identifier of the asset. If ImageVul is set to false, specify the host UUID. If ImageVul is set to true, specify the image ID. Separate multiple values with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>391abd09184cbd3743d7f5ec125d****,
         * e6aeb2a5b6004479398b0bcd1160****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeUuidVulNumClassifyStatisticRequest build() {
            return new DescribeUuidVulNumClassifyStatisticRequest(this);
        } 

    } 

}
