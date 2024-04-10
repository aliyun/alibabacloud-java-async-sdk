// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowRequest} extends {@link RequestModel}
 *
 * <p>ListFlowRequest</p>
 */
public class ListFlowRequest extends Request {
    @Body
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Body
    @NameInMap("FlowName")
    private String flowName;

    @Body
    @NameInMap("Page")
    private Page page;

    private ListFlowRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.flowName = builder.flowName;
        this.page = builder.page;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    public static final class Builder extends Request.Builder<ListFlowRequest, Builder> {
        private String custSpaceId; 
        private String flowName; 
        private Page page; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.flowName = request.flowName;
            this.page = request.page;
        } 

        /**
         * The space ID of the user within the independent software vendor (ISV) account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The name of the Flow.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * The returned pages.
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putBodyParameter("Page", pageShrink);
            this.page = page;
            return this;
        }

        @Override
        public ListFlowRequest build() {
            return new ListFlowRequest(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("Index")
        private Integer index;

        @NameInMap("Size")
        private Integer size;

        private Page(Builder builder) {
            this.index = builder.index;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer index; 
            private Integer size; 

            /**
             * The page number.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
