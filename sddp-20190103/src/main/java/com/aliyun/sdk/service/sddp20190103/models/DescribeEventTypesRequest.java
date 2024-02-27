// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventTypesRequest</p>
 */
public class DescribeEventTypesRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ParentTypeId")
    private Long parentTypeId;

    @Query
    @NameInMap("ResourceId")
    private Integer resourceId;

    @Query
    @NameInMap("Status")
    private Integer status;

    private DescribeEventTypesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.parentTypeId = builder.parentTypeId;
        this.resourceId = builder.resourceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return parentTypeId
     */
    public Long getParentTypeId() {
        return this.parentTypeId;
    }

    /**
     * @return resourceId
     */
    public Integer getResourceId() {
        return this.resourceId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeEventTypesRequest, Builder> {
        private String lang; 
        private Long parentTypeId; 
        private Integer resourceId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventTypesRequest request) {
            super(request);
            this.lang = request.lang;
            this.parentTypeId = request.parentTypeId;
            this.resourceId = request.resourceId;
            this.status = request.status;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The type of anomalous event for which you want to query the anomalous events of subtypes. Valid values:
         * <p>
         * 
         * *   **01**: anomalous permission usage
         * *   **02**: anomalous data flow
         * *   **03**: anomalous data operation
         */
        public Builder parentTypeId(Long parentTypeId) {
            this.putQueryParameter("ParentTypeId", parentTypeId);
            this.parentTypeId = parentTypeId;
            return this;
        }

        /**
         * The type of the resource. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.
         */
        public Builder resourceId(Integer resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The status of the anomalous event. Valid values:
         * <p>
         * 
         * *   **1**: enabled
         * *   **2**: disabled
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeEventTypesRequest build() {
            return new DescribeEventTypesRequest(this);
        } 

    } 

}
