// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link CreateAppLayoutRequest} extends {@link RequestModel}
 *
 * <p>CreateAppLayoutRequest</p>
 */
public class CreateAppLayoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Layout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Layout layout;

    private CreateAppLayoutRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.layout = builder.layout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppLayoutRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return layout
     */
    public Layout getLayout() {
        return this.layout;
    }

    public static final class Builder extends Request.Builder<CreateAppLayoutRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private Layout layout; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppLayoutRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.layout = request.layout;
        } 

        /**
         * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The client token.</p>
         * 
         * <strong>example:</strong>
         * <p>53200b81-b761-4c10-842a-a0726d97xxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The layout.</p>
         * <p>This parameter is required.</p>
         */
        public Builder layout(Layout layout) {
            String layoutShrink = shrink(layout, "Layout", "json");
            this.putQueryParameter("Layout", layoutShrink);
            this.layout = layout;
            return this;
        }

        @Override
        public CreateAppLayoutRequest build() {
            return new CreateAppLayoutRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppLayoutRequest} extends {@link TeaModel}
     *
     * <p>CreateAppLayoutRequest</p>
     */
    public static class Panes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double height;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        @com.aliyun.core.annotation.Validation(maximum = 15)
        private Long paneId;

        @com.aliyun.core.annotation.NameInMap("Width")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double width;

        @com.aliyun.core.annotation.NameInMap("X")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double x;

        @com.aliyun.core.annotation.NameInMap("Y")
        @com.aliyun.core.annotation.Validation(maximum = 1)
        private Double y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        @com.aliyun.core.annotation.Validation(maximum = 2)
        private Integer zOrder;

        private Panes(Builder builder) {
            this.height = builder.height;
            this.paneId = builder.paneId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Panes create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Double getHeight() {
            return this.height;
        }

        /**
         * @return paneId
         */
        public Long getPaneId() {
            return this.paneId;
        }

        /**
         * @return width
         */
        public Double getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Double getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Double getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Double height; 
            private Long paneId; 
            private Double width; 
            private Double x; 
            private Double y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Panes model) {
                this.height = model.height;
                this.paneId = model.paneId;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The height of the pane, represented as a normalized percentage. Valid values: 0.0 &lt; Height ≤ 1.0.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder height(Double height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the pane. The value starts from 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder paneId(Long paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * <p>The width of the pane, represented as a normalized percentage. Valid values: 0.0 &lt; Width ≤ 1.0.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder width(Double width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The X coordinate, represented as a normalized percentage. Valid values: 0.0 ≤ X ≤ 1.0.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder x(Double x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y coordinate, represented as a normalized percentage. Valid values: 0.0 ≤ Y ≤ 1.0.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder y(Double y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The Z-order of the pane. A value of 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAppLayoutRequest} extends {@link TeaModel}
     *
     * <p>CreateAppLayoutRequest</p>
     */
    public static class Layout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Panes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Panes> panes;

        private Layout(Builder builder) {
            this.name = builder.name;
            this.panes = builder.panes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layout create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return panes
         */
        public java.util.List<Panes> getPanes() {
            return this.panes;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<Panes> panes; 

            private Builder() {
            } 

            private Builder(Layout model) {
                this.name = model.name;
                this.panes = model.panes;
            } 

            /**
             * <p>The name of the layout.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Layout</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of panes.</p>
             * <p>This parameter is required.</p>
             */
            public Builder panes(java.util.List<Panes> panes) {
                this.panes = panes;
                return this;
            }

            public Layout build() {
                return new Layout(this);
            } 

        } 

    }
}
