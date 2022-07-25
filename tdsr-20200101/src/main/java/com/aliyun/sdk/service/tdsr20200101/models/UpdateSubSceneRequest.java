// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubSceneRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubSceneRequest</p>
 */
public class UpdateSubSceneRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ViewPoint")
    private java.util.List < Double > viewPoint;

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
    public java.util.List < Double > getViewPoint() {
        return this.viewPoint;
    }

    public static final class Builder extends Request.Builder<UpdateSubSceneRequest, Builder> {
        private String id; 
        private String name; 
        private java.util.List < Double > viewPoint; 

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
         * 子场景ID
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 子场景名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 视角坐标，目前支持3元坐标，4元坐标，例如：[0.94005,0.13397,-0.3136,0.782992]
         */
        public Builder viewPoint(java.util.List < Double > viewPoint) {
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
