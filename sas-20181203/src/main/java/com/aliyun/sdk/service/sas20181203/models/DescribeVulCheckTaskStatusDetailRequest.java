// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulCheckTaskStatusDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulCheckTaskStatusDetailRequest</p>
 */
public class DescribeVulCheckTaskStatusDetailRequest extends Request {
    @Query
    @NameInMap("TaskIds")
    private java.util.List < String > taskIds;

    @Query
    @NameInMap("Types")
    private java.util.List < String > types;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private DescribeVulCheckTaskStatusDetailRequest(Builder builder) {
        super(builder);
        this.taskIds = builder.taskIds;
        this.types = builder.types;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulCheckTaskStatusDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskIds
     */
    public java.util.List < String > getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeVulCheckTaskStatusDetailRequest, Builder> {
        private java.util.List < String > taskIds; 
        private java.util.List < String > types; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulCheckTaskStatusDetailRequest request) {
            super(request);
            this.taskIds = request.taskIds;
            this.types = request.types;
            this.uuid = request.uuid;
        } 

        /**
         * The IDs of tasks.
         */
        public Builder taskIds(java.util.List < String > taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * The types of the vulnerabilities that are detected by the tasks.
         */
        public Builder types(java.util.List < String > types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * The UUID of the server.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeVulCheckTaskStatusDetailRequest build() {
            return new DescribeVulCheckTaskStatusDetailRequest(this);
        } 

    } 

}
