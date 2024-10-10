// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeScanTaskStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeScanTaskStatisticsRequest</p>
 */
public class DescribeScanTaskStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Levels")
    private String levels;

    private DescribeScanTaskStatisticsRequest(Builder builder) {
        super(builder);
        this.levels = builder.levels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanTaskStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return levels
     */
    public String getLevels() {
        return this.levels;
    }

    public static final class Builder extends Request.Builder<DescribeScanTaskStatisticsRequest, Builder> {
        private String levels; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScanTaskStatisticsRequest request) {
            super(request);
            this.levels = request.levels;
        } 

        /**
         * <p>The severities of the alert events handled by the virus detection task. Separate multiple severities with commas (,). The severities decrease in descending order. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>remind</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious,suspicious,remind</p>
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        @Override
        public DescribeScanTaskStatisticsRequest build() {
            return new DescribeScanTaskStatisticsRequest(this);
        } 

    } 

}
