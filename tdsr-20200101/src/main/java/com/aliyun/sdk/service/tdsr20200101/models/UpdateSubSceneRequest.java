// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link UpdateSubSceneRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubSceneRequest</p>
 */
public class UpdateSubSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewPoint")
    private java.util.List<Double> viewPoint;

    private UpdateSubSceneRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.viewPoint = builder.viewPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return viewPoint
     */
    public java.util.List<Double> getViewPoint() {
        return this.viewPoint;
    }

    public static final class Builder extends Request.Builder<UpdateSubSceneRequest, Builder> {
        private String id; 
        private String name; 
        private java.util.List<Double> viewPoint; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubSceneRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
            this.viewPoint = request.viewPoint;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234****</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ViewPoint.
         */
        public Builder viewPoint(java.util.List<Double> viewPoint) {
            String viewPointShrink = shrink(viewPoint, "ViewPoint", "json");
            this.putQueryParameter("ViewPoint", viewPointShrink);
            this.viewPoint = viewPoint;
            return this;
        }

        @Override
        public UpdateSubSceneRequest build() {
            return new UpdateSubSceneRequest(this);
        } 

    } 

}
