// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetDirectoryStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetDirectoryStatisticsRequest</p>
 */
public class GetDirectoryStatisticsRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;


    private GetDirectoryStatisticsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectoryStatisticsRequest create() {
        return builder().build();
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder {
        private String directoryId; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        public GetDirectoryStatisticsRequest build() {
            return new GetDirectoryStatisticsRequest(this);
        } 

    } 

}
