// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApmRequest} extends {@link RequestModel}
 *
 * <p>ListApmRequest</p>
 */
public class ListApmRequest extends Request {
    @Query
    @NameInMap("description")
    private String description;

    @Query
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("output")
    private String output;

    @Query
    @NameInMap("page")
    private Long page;

    @Query
    @NameInMap("size")
    private Long size;

    private ListApmRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.output = builder.output;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListApmRequest, Builder> {
        private String description; 
        private String instanceId; 
        private String output; 
        private Long page; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListApmRequest response) {
            super(response);
            this.description = response.description;
            this.instanceId = response.instanceId;
            this.output = response.output;
            this.page = response.page;
            this.size = response.size;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * output.
         */
        public Builder output(String output) {
            this.putQueryParameter("output", output);
            this.output = output;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListApmRequest build() {
            return new ListApmRequest(this);
        } 

    } 

}
