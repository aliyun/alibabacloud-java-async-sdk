// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.anytrans20250707.models;

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
 * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageTranslateTaskResponseBody</p>
 */
public class GetImageTranslateTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("synchro")
    private Boolean synchro;

    private GetImageTranslateTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageTranslateTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(GetImageTranslateTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.synchro = model.synchro;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetImageTranslateTaskResponseBody build() {
            return new GetImageTranslateTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class DownLeft extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private DownLeft(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownLeft create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(DownLeft model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public DownLeft build() {
                return new DownLeft(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class DownRight extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private DownRight(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownRight create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(DownRight model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public DownRight build() {
                return new DownRight(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class UpLeft extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private UpLeft(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpLeft create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(UpLeft model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public UpLeft build() {
                return new UpLeft(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class UpRight extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private UpRight(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpRight create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(UpRight model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public UpRight build() {
                return new UpRight(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class BoundingBoxes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("direction")
        private Long direction;

        @com.aliyun.core.annotation.NameInMap("downLeft")
        private DownLeft downLeft;

        @com.aliyun.core.annotation.NameInMap("downRight")
        private DownRight downRight;

        @com.aliyun.core.annotation.NameInMap("tableCellId")
        private Long tableCellId;

        @com.aliyun.core.annotation.NameInMap("tableId")
        private Long tableId;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("translation")
        private java.util.Map<String, ?> translation;

        @com.aliyun.core.annotation.NameInMap("upLeft")
        private UpLeft upLeft;

        @com.aliyun.core.annotation.NameInMap("upRight")
        private UpRight upRight;

        private BoundingBoxes(Builder builder) {
            this.confidence = builder.confidence;
            this.direction = builder.direction;
            this.downLeft = builder.downLeft;
            this.downRight = builder.downRight;
            this.tableCellId = builder.tableCellId;
            this.tableId = builder.tableId;
            this.text = builder.text;
            this.translation = builder.translation;
            this.upLeft = builder.upLeft;
            this.upRight = builder.upRight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BoundingBoxes create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return direction
         */
        public Long getDirection() {
            return this.direction;
        }

        /**
         * @return downLeft
         */
        public DownLeft getDownLeft() {
            return this.downLeft;
        }

        /**
         * @return downRight
         */
        public DownRight getDownRight() {
            return this.downRight;
        }

        /**
         * @return tableCellId
         */
        public Long getTableCellId() {
            return this.tableCellId;
        }

        /**
         * @return tableId
         */
        public Long getTableId() {
            return this.tableId;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return translation
         */
        public java.util.Map<String, ?> getTranslation() {
            return this.translation;
        }

        /**
         * @return upLeft
         */
        public UpLeft getUpLeft() {
            return this.upLeft;
        }

        /**
         * @return upRight
         */
        public UpRight getUpRight() {
            return this.upRight;
        }

        public static final class Builder {
            private Float confidence; 
            private Long direction; 
            private DownLeft downLeft; 
            private DownRight downRight; 
            private Long tableCellId; 
            private Long tableId; 
            private String text; 
            private java.util.Map<String, ?> translation; 
            private UpLeft upLeft; 
            private UpRight upRight; 

            private Builder() {
            } 

            private Builder(BoundingBoxes model) {
                this.confidence = model.confidence;
                this.direction = model.direction;
                this.downLeft = model.downLeft;
                this.downRight = model.downRight;
                this.tableCellId = model.tableCellId;
                this.tableId = model.tableId;
                this.text = model.text;
                this.translation = model.translation;
                this.upLeft = model.upLeft;
                this.upRight = model.upRight;
            } 

            /**
             * confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * direction.
             */
            public Builder direction(Long direction) {
                this.direction = direction;
                return this;
            }

            /**
             * downLeft.
             */
            public Builder downLeft(DownLeft downLeft) {
                this.downLeft = downLeft;
                return this;
            }

            /**
             * downRight.
             */
            public Builder downRight(DownRight downRight) {
                this.downRight = downRight;
                return this;
            }

            /**
             * tableCellId.
             */
            public Builder tableCellId(Long tableCellId) {
                this.tableCellId = tableCellId;
                return this;
            }

            /**
             * tableId.
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * translation.
             */
            public Builder translation(java.util.Map<String, ?> translation) {
                this.translation = translation;
                return this;
            }

            /**
             * upLeft.
             */
            public Builder upLeft(UpLeft upLeft) {
                this.upLeft = upLeft;
                return this;
            }

            /**
             * upRight.
             */
            public Builder upRight(UpRight upRight) {
                this.upRight = upRight;
                return this;
            }

            public BoundingBoxes build() {
                return new BoundingBoxes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class Pos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private Pos(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pos create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(Pos model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public Pos build() {
                return new Pos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class CellInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pos")
        private java.util.List<Pos> pos;

        @com.aliyun.core.annotation.NameInMap("tableCellId")
        private Long tableCellId;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("xec")
        private Long xec;

        @com.aliyun.core.annotation.NameInMap("xsc")
        private Long xsc;

        @com.aliyun.core.annotation.NameInMap("yec")
        private Long yec;

        @com.aliyun.core.annotation.NameInMap("ysc")
        private Long ysc;

        private CellInfos(Builder builder) {
            this.pos = builder.pos;
            this.tableCellId = builder.tableCellId;
            this.text = builder.text;
            this.xec = builder.xec;
            this.xsc = builder.xsc;
            this.yec = builder.yec;
            this.ysc = builder.ysc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CellInfos create() {
            return builder().build();
        }

        /**
         * @return pos
         */
        public java.util.List<Pos> getPos() {
            return this.pos;
        }

        /**
         * @return tableCellId
         */
        public Long getTableCellId() {
            return this.tableCellId;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return xec
         */
        public Long getXec() {
            return this.xec;
        }

        /**
         * @return xsc
         */
        public Long getXsc() {
            return this.xsc;
        }

        /**
         * @return yec
         */
        public Long getYec() {
            return this.yec;
        }

        /**
         * @return ysc
         */
        public Long getYsc() {
            return this.ysc;
        }

        public static final class Builder {
            private java.util.List<Pos> pos; 
            private Long tableCellId; 
            private String text; 
            private Long xec; 
            private Long xsc; 
            private Long yec; 
            private Long ysc; 

            private Builder() {
            } 

            private Builder(CellInfos model) {
                this.pos = model.pos;
                this.tableCellId = model.tableCellId;
                this.text = model.text;
                this.xec = model.xec;
                this.xsc = model.xsc;
                this.yec = model.yec;
                this.ysc = model.ysc;
            } 

            /**
             * pos.
             */
            public Builder pos(java.util.List<Pos> pos) {
                this.pos = pos;
                return this;
            }

            /**
             * tableCellId.
             */
            public Builder tableCellId(Long tableCellId) {
                this.tableCellId = tableCellId;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * xec.
             */
            public Builder xec(Long xec) {
                this.xec = xec;
                return this;
            }

            /**
             * xsc.
             */
            public Builder xsc(Long xsc) {
                this.xsc = xsc;
                return this;
            }

            /**
             * yec.
             */
            public Builder yec(Long yec) {
                this.yec = yec;
                return this;
            }

            /**
             * ysc.
             */
            public Builder ysc(Long ysc) {
                this.ysc = ysc;
                return this;
            }

            public CellInfos build() {
                return new CellInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class TableInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cellInfos")
        private java.util.List<CellInfos> cellInfos;

        @com.aliyun.core.annotation.NameInMap("tableId")
        private Long tableId;

        @com.aliyun.core.annotation.NameInMap("xCellSize")
        private Long xCellSize;

        @com.aliyun.core.annotation.NameInMap("yCellSize")
        private Long yCellSize;

        private TableInfos(Builder builder) {
            this.cellInfos = builder.cellInfos;
            this.tableId = builder.tableId;
            this.xCellSize = builder.xCellSize;
            this.yCellSize = builder.yCellSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfos create() {
            return builder().build();
        }

        /**
         * @return cellInfos
         */
        public java.util.List<CellInfos> getCellInfos() {
            return this.cellInfos;
        }

        /**
         * @return tableId
         */
        public Long getTableId() {
            return this.tableId;
        }

        /**
         * @return xCellSize
         */
        public Long getXCellSize() {
            return this.xCellSize;
        }

        /**
         * @return yCellSize
         */
        public Long getYCellSize() {
            return this.yCellSize;
        }

        public static final class Builder {
            private java.util.List<CellInfos> cellInfos; 
            private Long tableId; 
            private Long xCellSize; 
            private Long yCellSize; 

            private Builder() {
            } 

            private Builder(TableInfos model) {
                this.cellInfos = model.cellInfos;
                this.tableId = model.tableId;
                this.xCellSize = model.xCellSize;
                this.yCellSize = model.yCellSize;
            } 

            /**
             * cellInfos.
             */
            public Builder cellInfos(java.util.List<CellInfos> cellInfos) {
                this.cellInfos = cellInfos;
                return this;
            }

            /**
             * tableId.
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * xCellSize.
             */
            public Builder xCellSize(Long xCellSize) {
                this.xCellSize = xCellSize;
                return this;
            }

            /**
             * yCellSize.
             */
            public Builder yCellSize(Long yCellSize) {
                this.yCellSize = yCellSize;
                return this;
            }

            public TableInfos build() {
                return new TableInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class Translation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("angle")
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("boundingBoxes")
        private java.util.List<BoundingBoxes> boundingBoxes;

        @com.aliyun.core.annotation.NameInMap("boxesCount")
        private Long boxesCount;

        @com.aliyun.core.annotation.NameInMap("height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("orgHeight")
        private Long orgHeight;

        @com.aliyun.core.annotation.NameInMap("orgWidth")
        private Long orgWidth;

        @com.aliyun.core.annotation.NameInMap("tableInfos")
        private java.util.List<TableInfos> tableInfos;

        @com.aliyun.core.annotation.NameInMap("width")
        private Long width;

        private Translation(Builder builder) {
            this.angle = builder.angle;
            this.boundingBoxes = builder.boundingBoxes;
            this.boxesCount = builder.boxesCount;
            this.height = builder.height;
            this.orgHeight = builder.orgHeight;
            this.orgWidth = builder.orgWidth;
            this.tableInfos = builder.tableInfos;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Translation create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Long getAngle() {
            return this.angle;
        }

        /**
         * @return boundingBoxes
         */
        public java.util.List<BoundingBoxes> getBoundingBoxes() {
            return this.boundingBoxes;
        }

        /**
         * @return boxesCount
         */
        public Long getBoxesCount() {
            return this.boxesCount;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return orgHeight
         */
        public Long getOrgHeight() {
            return this.orgHeight;
        }

        /**
         * @return orgWidth
         */
        public Long getOrgWidth() {
            return this.orgWidth;
        }

        /**
         * @return tableInfos
         */
        public java.util.List<TableInfos> getTableInfos() {
            return this.tableInfos;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Long angle; 
            private java.util.List<BoundingBoxes> boundingBoxes; 
            private Long boxesCount; 
            private Long height; 
            private Long orgHeight; 
            private Long orgWidth; 
            private java.util.List<TableInfos> tableInfos; 
            private Long width; 

            private Builder() {
            } 

            private Builder(Translation model) {
                this.angle = model.angle;
                this.boundingBoxes = model.boundingBoxes;
                this.boxesCount = model.boxesCount;
                this.height = model.height;
                this.orgHeight = model.orgHeight;
                this.orgWidth = model.orgWidth;
                this.tableInfos = model.tableInfos;
                this.width = model.width;
            } 

            /**
             * angle.
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * boundingBoxes.
             */
            public Builder boundingBoxes(java.util.List<BoundingBoxes> boundingBoxes) {
                this.boundingBoxes = boundingBoxes;
                return this;
            }

            /**
             * boxesCount.
             */
            public Builder boxesCount(Long boxesCount) {
                this.boxesCount = boxesCount;
                return this;
            }

            /**
             * height.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * orgHeight.
             */
            public Builder orgHeight(Long orgHeight) {
                this.orgHeight = orgHeight;
                return this;
            }

            /**
             * orgWidth.
             */
            public Builder orgWidth(Long orgWidth) {
                this.orgWidth = orgWidth;
                return this;
            }

            /**
             * tableInfos.
             */
            public Builder tableInfos(java.util.List<TableInfos> tableInfos) {
                this.tableInfos = tableInfos;
                return this;
            }

            /**
             * width.
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public Translation build() {
                return new Translation(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageTranslateTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTranslateTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("translation")
        private Translation translation;

        private Data(Builder builder) {
            this.traceId = builder.traceId;
            this.translation = builder.translation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return translation
         */
        public Translation getTranslation() {
            return this.translation;
        }

        public static final class Builder {
            private String traceId; 
            private Translation translation; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.traceId = model.traceId;
                this.translation = model.translation;
            } 

            /**
             * traceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * translation.
             */
            public Builder translation(Translation translation) {
                this.translation = translation;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
